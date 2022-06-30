package com.yxm.controller;

import com.yxm.dao.UserDao;
import com.yxm.utils.Utils;
import com.yxm.vo.BuyCar;
import com.yxm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * 登入，注册管理
 */
@Controller
@RequestMapping(value = "/user")
public class LoginController {
    @Autowired
    private UserDao dao;

    @PostMapping(value = "/checkName")
    @ResponseBody
    public String checkName(String name, HttpSession session, HttpServletResponse response) {
        User user = new User(name, "no");
        response.setCharacterEncoding("UTF-8");
        if (dao.checkUserName(user) != null) {
            return "true";
        } else {
            return "false";
        }
    }


    @GetMapping(value = "/register")
    public String register(@ModelAttribute("user") User user) {
        return "AyGame/user/register";
    }

    @PostMapping(value = "/register")
    public String register(@Validated User user, BindingResult bindingResult, HttpSession session) {
        if (bindingResult.hasErrors()) {
            return "AyGame/user/register";
        }
        String password = Utils.sha1(user.getPassword());
        user.setPassword(password);
        user.setRegisterDate(new Date());
        int userId = dao.insertUser(user);
        if (userId > 0) {
            user = dao.getUser(user);
            session.setAttribute("user", user);
            session.setAttribute("buyCar", new BuyCar(user));
            return "redirect:details";
        } else {
            return "AyGame/user/register";
        }
    }

    @GetMapping(value = "/login")
    public String login(@ModelAttribute("user") User user) {
        return "AyGame/user/login";
    }

    @PostMapping(value = "/login")
    public String login(User user, BindingResult bindingResult, Model model, HttpSession session) {
        if (bindingResult.hasErrors()) {
            return "AyGame/user/login";
        }
        String password = Utils.sha1(user.getPassword());
        user.setPassword(password);
        User realUser = dao.getUser(user);
        if (realUser == null) {
            model.addAttribute("message", "没有该用户名。");
            return "AyGame/user/login";
        }
        if (realUser.getPassword().equals(user.getPassword())) {
            session.setAttribute("user", realUser);
            session.setAttribute("buyCar", new BuyCar(realUser));
            return "redirect:details";
        } else {
            model.addAttribute("message", "密码错误");
            return "AyGame/user/login";
        }
    }
}
