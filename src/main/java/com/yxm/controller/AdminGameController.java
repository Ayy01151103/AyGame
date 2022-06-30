package com.yxm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxm.dao.CategoryDao;
import com.yxm.dao.GameDao;
import com.yxm.dao.PictureDao;
import com.yxm.dao.PlatformDao;
import com.yxm.service.AgGameMainService;
import com.yxm.vo.Game;
import com.yxm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping(value = "/admin/game")
public class AdminGameController extends AdminController {


    @Autowired
    private GameDao gameDao;
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private PlatformDao platformDao;
    @Autowired
    private PictureDao pictureDao;
    @Autowired
    private AgGameMainService agGameMainService;
    //***********游戏部分***********

    @GetMapping(value = "")
    public String gameManager(Integer cid, Integer pid, String name, Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, @RequestParam(defaultValue = "5", value = "pageSize") Integer pageSize) {
        /*
        Game game = new Game(cid, pid);
        model.addAttribute("games", gameDao.getGames(game));*/
        PageHelper.startPage(pageNum, pageSize);
        if (name != null) {
            name = "%" + name + "%";
        }
        List<Game> games = gameDao.getGames(new Game(name, (cid), (pid)));
        PageInfo<Game> pageInfo = new PageInfo<>(games);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("categories", categoryDao.getAllCategories());
        model.addAttribute("platforms", platformDao.getAllPlatforms());
        return "AyGame/admin/game/game_manager";
    }

    @GetMapping(value = "/add")
    public String addGame(Model model) {
        model.addAttribute("game", new Game());
        model.addAttribute("categories", categoryDao.getAllCategories());
        model.addAttribute("platforms", platformDao.getAllPlatforms());
        return "AyGame/admin/game/game_add";
    }

    @PostMapping(value = "/add")
    public String addGame(@Validated Game game, BindingResult bindingResult, @RequestParam(value = "files", required = false) MultipartFile[] files, @RequestParam(value = "file", required = false) MultipartFile file, Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (bindingResult.hasErrors()) {
            String message = (new Date() + "添加失败，游戏数据错误。错误区域：");
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
                message += error.getField();
            }
            user.getMessages().addFirst(message);
            return "user/details";
        }
        if (gameDao.getGame(game) != null) {
            user.getMessages().addFirst("添加失败，游戏名已存在。");
            return "redirect:/admin/game";
        }
        if (file == null) {
            user.getMessages().addFirst("请上传图片");
            return "redirect:/admin/game";
        }
        int result = gameDao.insert(game);
        agGameMainService.savePoster(user, game, file);
        if (result > 0) {
            user.getMessages().addFirst("时间：" + new Date() + "游戏添加成功。");
            Game theGame = gameDao.getGame(game);
            agGameMainService.savePicture(user, theGame, session, files);
        } else {
            user.getMessages().addFirst("时间：" + new Date() + "游戏添加失败。");
        }
        return "redirect:/admin/game";
    }

    @GetMapping("/update/{id}")
    public String updateGame(@PathVariable("id") Integer id, Model model) {
        Game game = gameDao.getGame(new Game(id));
        model.addAttribute("categories", categoryDao.getAllCategories());
        model.addAttribute("platforms", platformDao.getAllPlatforms());
        model.addAttribute("game", game);
        return "AyGame/admin/game/game_edit";
    }

    @PostMapping("/update/{id}")
    public String updateGame(@Validated Game game, BindingResult bindingResult, MultipartFile[] files, MultipartFile file, HttpServletRequest request, Model model, HttpSession session, @PathVariable("id") String id) {
        User user = (User) session.getAttribute("user");
        //检测game参数
        if (bindingResult.hasErrors()) {
            String message = (new Date() + "修改失败，游戏数据错误。错误区域：");
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
                message += error.getField();
            }
            user.getMessages().addFirst(message);
            return "redirect:/admin/game/update" + id;
        }
        //更新game数据
        int result = gameDao.update(game);
        if (!file.isEmpty()) {
            agGameMainService.savePoster(user, game, file);
        }
        if (result <= 0) {
            user.getMessages().addFirst(new Date() + "游戏修改失败");
            return "admin/updateGame";
        } else {
            //保存图片
            agGameMainService.updatePicture(user, game, session, files);
        }
        return "redirect:/admin/game";
    }

    @RequestMapping("/{id}")
    public String deleteGame(@PathVariable("id") Integer id, Game game, HttpSession session, Model model) {
        if (id != null && id.equals(game.getId())) {
            int result = gameDao.deleteGame(game);
            User user = (User) session.getAttribute("user");
            if (result > 0) {
                user.getMessages().addFirst("时间：" + new Date() + ",删除分类信息成功。");
                return "redirect:/admin/game";
            } else {
                model.addAttribute("message", "修改失败");
            }
        }
        return "redirect:/admin/game";
    }
}
