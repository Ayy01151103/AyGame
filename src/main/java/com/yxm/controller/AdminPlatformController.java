package com.yxm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxm.dao.PlatformDao;
import com.yxm.vo.Platform;
import com.yxm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping(value = "/admin/platform")
public class AdminPlatformController extends AdminController {
    @Autowired
    private PlatformDao platformDao;

    //***********平台部分***********

    @RequestMapping(value = "")
    public String getPlatform(Model model,@RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, @RequestParam(defaultValue = "10", value = "pageSize") Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Platform> platform = platformDao.getAllPlatforms();
        PageInfo<Platform> pageInfo = new PageInfo<>(platform);
        model.addAttribute("pageInfo", pageInfo);
        return "AyGame/admin/platform/platform_manager";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPlatform(Model model) {
        model.addAttribute("platform", new Platform());
        return "AyGame/admin/platform/platform_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPlatform(Platform platform, HttpSession session, Model model) {
        platform.setId(null);
        if (platformDao.getPlatform(platform) == null) {
            int result = platformDao.insert(platform);
            User user = (User) session.getAttribute("user");
            if (result > 0) {
                user.getMessages().addFirst("时间：" + new Date() + ",添加平台信息成功。");
                return "redirect:/admin/platform";
            } else {
                model.addAttribute("message", "添加失败");
            }
        } else {
            model.addAttribute("message", "添加失败，平台已存在");
        }
        return "AyGame/admin/platform/platform_add";
    }

    @GetMapping(value = "/update/{id}")
    public String updatePlatform(@PathVariable int id, Model model) {
        Platform platform = platformDao.getPlatform(new Platform(id));
        model.addAttribute("platform", platform);
        return "AyGame/admin/platform/platform_edit";
    }

    @PutMapping("/update/{id}")
    public String updatePlatform(@PathVariable Integer id, Platform platform, HttpSession session, Model model) {
        if (id != null && id.equals(platform.getId())) {
            int result = platformDao.update(platform);
            User user = (User) session.getAttribute("user");
            if (result > 0) {
                user.getMessages().addFirst("时间：" + new Date() + ",修改平台信息成功。");
                return "redirect:/admin/platform";
            } else {
                model.addAttribute("message", "修改失败");
            }
        } else {
            model.addAttribute("message", "修改失败，ID不匹配");
        }
        return "AyGame/admin/platform/platform_edit";
    }

    @RequestMapping("/{id}")
    public String deletePlatform(@PathVariable("id") Integer id, Platform platform, HttpSession session, Model model) {
        if (id != null && id == platform.getId()) {
            int result = platformDao.deletePlatform(platform);
            User user = (User) session.getAttribute("user");
            if (result > 0) {
                user.getMessages().addFirst("时间：" + new Date() + ",删除分类信息成功。");
                return "redirect:/admin/platform";
            } else {
                model.addAttribute("message", "修改失败");
            }
        }
        return "redirect:/admin/platform";
    }

}
