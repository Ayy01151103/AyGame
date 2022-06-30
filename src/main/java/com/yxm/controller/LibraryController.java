package com.yxm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxm.dao.CategoryDao;
import com.yxm.dao.GameDao;
import com.yxm.dao.LibraryDao;
import com.yxm.dao.PlatformDao;
import com.yxm.vo.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping(value = "/library")
public class LibraryController {
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private PlatformDao platformDao;
    @Autowired
    private GameDao gameDao;
    @Autowired
    private LibraryDao libraryDao;


    @GetMapping(value = "/grid")
    public String libraryViewGrid(String cid, String pid, String gameName, Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        if (gameName != null)
            gameName = "%" + gameName + "%";
        PageHelper.startPage(pageNum, 8);
        List<Game> games = gameDao.getGames(new Game(gameName, parseInt(cid), parseInt(pid)));
        PageInfo<Game> pageInfo1 = new PageInfo<>(games);
        model.addAttribute("pageInfo1", pageInfo1);
//        model.addAttribute("games", games);
        model.addAttribute("categories", categoryDao.getAllCategories());
        model.addAttribute("platforms", platformDao.getAllPlatforms());
        return "library/game_grid";
    }

    @GetMapping(value = "/list")
    public String libraryViewList(String cid, String pid, String gameName, Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        if (gameName != null)
            gameName = "%" + gameName + "%";
        PageHelper.startPage(pageNum, 8);
        List<Game> games = gameDao.getGames(new Game(gameName, parseInt(cid), parseInt(pid)));
        PageInfo<Game> pageInfo2 = new PageInfo<>(games);
        model.addAttribute("pageInfo2", pageInfo2);
        model.addAttribute("categories", categoryDao.getAllCategories());
        model.addAttribute("platforms", platformDao.getAllPlatforms());
        return "library/game_list";
    }


    @GetMapping(value = "/game/{id}")
    public String gameDetails(@PathVariable String id, Model model) {
        Integer gid = parseInt(id);
        Game game = gameDao.getGame(new Game(gid));
        if (game == null) {
            model.addAttribute("message", "没有该游戏.");
        } else {
            model.addAttribute("game", game);
            model.addAttribute("sales", libraryDao.getSales(game));
        }
        return "library/game";
    }

    private Integer parseInt(String str) {
        Integer i;
        if (str == null)
            return 0;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
        return i;
    }
}
