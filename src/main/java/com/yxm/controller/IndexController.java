package com.yxm.controller;

import com.yxm.dao.GameDao;
import com.yxm.vo.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class IndexController {
    @Autowired
    private GameDao gameDao;

    //访问主页
    @RequestMapping(value = {"/index", "/", ""})
    public String index(Model model) {
        List<Game> hotGames = gameDao.getHot();
        List<Game> newGames = gameDao.getNew();
        List<Game> buyGames = gameDao.getBuy();
        List<Game> getType1game = gameDao.getType1game();
        List<Game> getType2game = gameDao.getType2game();
        List<Game> getType3game = gameDao.getType3game();
        List<Game> getType4game = gameDao.getType4game();
        model.addAttribute("newGames", newGames);
        model.addAttribute("hotGames", hotGames);
        model.addAttribute("buyGames", buyGames);
        model.addAttribute("getType1game", getType1game);
        model.addAttribute("getType2game", getType2game);
        model.addAttribute("getType3game", getType3game);
        model.addAttribute("getType4game", getType4game);
        return "indexme";

    }
}
