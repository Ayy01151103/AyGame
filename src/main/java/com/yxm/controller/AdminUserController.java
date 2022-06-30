package com.yxm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxm.dao.UserDao;
import com.yxm.service.AgUserMainService;
import com.yxm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author panyang
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminUserController {
    @Autowired
    private UserDao userDao;

    @Autowired
    private AgUserMainService agUserMainService;


    /**
     * 用户管理页面
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    @GetMapping("/users")
    public String userManager(Model model, String name, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, @RequestParam(defaultValue = "5", value = "pageSize") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        if (name != null) {
            name = "%" + name + "%";
            List<User> list = agUserMainService.findList(new User(name));
            PageInfo<User> pageInfo = new PageInfo<>(list);
            model.addAttribute("pageInfo", pageInfo);
        } else {
            List<User> list = agUserMainService.findAllUsers();
            PageInfo<User> pageInfo = new PageInfo<>(list);
            model.addAttribute("pageInfo", pageInfo);
        }
        return "AyGame/admin/user/userManager";
    }

    /**
     * 跳转到添加界面
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    @GetMapping("/user")
    public String toAddPage() {
        return "AyGame/admin/user/add";
    }

    /**
     * 用户添加
     */
    @PostMapping("/user/add")
    public String addUser(User user) {
        agUserMainService.insert(user);
        return "redirect:/admin/users";
    }

    /**
     * 根据ID删除
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    @RequestMapping("/deleteById/{id}")
    public String delete(@PathVariable("id") Integer id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        agUserMainService.deleteById(id);
        return "redirect:/admin/users";
    }

    /**
     * 根据ID修改
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    @GetMapping("/updateById/{id}")
    public ModelAndView updateUserById(@PathVariable("id") Integer id, HttpServletRequest request, Model model) {
        /*Integer fdId = Integer.valueOf(request.getParameter("id"));*/
        User user = agUserMainService.findById(id);
        model.addAttribute("user", user);
        return new ModelAndView("AyGame/admin/user/edit", "userModel", model);
    }

    @PutMapping("/editUser")
    public String edit(User user, HttpServletResponse response) throws IOException {
        /*String password = Utils.sha1(user.getPassword());*/
        agUserMainService.updateById(user);
        return "redirect:/admin/users";
    }

    @GetMapping("/user/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        User user = userDao.getUserById(id);
        model.addAttribute("user", user);
        return "admin/updateUser";
    }

    @PutMapping("/user")
    public String updateUser(User user) {
        userDao.updateUser(user);
        return "redirect:/admin/users";
    }

    @DeleteMapping("/userDelete/{id}")
    public String deleteUser(@PathVariable("id") Integer id, User user, HttpSession session, Model model) {
        if (id != null && id.equals(user.getId())) {
            int result = userDao.deleteUser(user);
            User user1 = (User) session.getAttribute("user");
            if (result > 0) {
                user1.getMessages().addFirst("时间：" + new Date() + ",删除用户信息成功。");
                return "redirect:/admin/users";
            } else {
                model.addAttribute("messages", "修改失败");
            }
        }
        return "redirect:/admin/users";
    }
}
