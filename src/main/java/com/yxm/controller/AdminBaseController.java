package com.yxm.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxm.dao.GameDao;
import com.yxm.dao.UserDao;
import com.yxm.service.AgUserMainService;
import com.yxm.vo.Game;
import com.yxm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * 管理员管理
 * @author panyang
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminBaseController extends AdminController {
    @Autowired
    private GameDao gameDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private AgUserMainService agUserMainService;
    @RequestMapping(value = "")
    public ModelAndView admin(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, @RequestParam(defaultValue = "4", value = "pageSize") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Game> newGames = gameDao.getNewGame_admin();
        List<User> users = userDao.getNewUser();
        PageInfo<Game> pageInfo = new PageInfo<>(newGames);
        model.addAttribute("NewGamePageInfo", pageInfo);
        model.addAttribute("NewUserPageInfo", users);
        ModelAndView mav = new ModelAndView("AyGame/common/ayindex");
        return mav;
    }
}
