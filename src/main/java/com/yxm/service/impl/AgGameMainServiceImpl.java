
package com.yxm.service.impl;


import com.yxm.dao.AgGameMainMapper;
import com.yxm.dao.GameDao;
import com.yxm.dao.PictureDao;
import com.yxm.service.AgGameMainService;
import com.yxm.utils.Utils;
import com.yxm.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;


/**
 * 游戏Service实现
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 */


@Service
public class AgGameMainServiceImpl implements AgGameMainService {

    @Autowired
    private AgGameMainMapper agGameMainMapper;
    @Autowired
    private GameDao gameDao;
    @Autowired
    private PictureDao pictureDao;

    @Override
    public Integer create(Game agGameMain) {
        agGameMainMapper.insert(agGameMain);
        return agGameMain.getId();
    }

    @Override
    public void deleteById(Integer id) {
        agGameMainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return;
        }
        for (Integer id : ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(Game agGameMain) {
        agGameMainMapper.updateByPrimaryKey(agGameMain);
    }

    @Override
    public void updateByIdInBatch(List<Game> agGameMains) {
        if (CollectionUtils.isEmpty(agGameMains)) {
            return;
        }
        for (Game agGameMain : agGameMains) {
            this.updateById(agGameMain);
        }
    }

    @Override
    public Game findById(String id) {
        return null;
    }

    @Override
    public Game findOne(Game agGameMain) {
        return null;
    }

    @Override
    public List<Game> findList(Game agGameMain) {
        return agGameMainMapper.selectGamesByCondition(agGameMain);
    }

    @Override
    public PageData<Game> findPage(PageWrap<Game> pageWrap) {
        return null;
    }

    @Override
    public long count(Game agGameMain) {
        return 0;
    }

    @Override
    public List<Game> findAllGames(Game game) {
        return agGameMainMapper.selectAllGames();
    }

    @Override
    public void savePoster(User user, Game game, MultipartFile src) {
        if (src.isEmpty()) {
            user.getMessages().addFirst("上传失败，请选择文件");
        }
        String fileType = Utils.getFileType(src.getOriginalFilename());
        String fileName = game.getId() + "_" + "game" + fileType;
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\public\\images\\";
        File dest = new File(filePath + fileName);
        try {
            src.transferTo(dest);
            gameDao.updatePoster(new Game(dest.getName(), game.getId()));
        } catch (IOException e) {
            user.getMessages().addFirst("时间：" + new Date() + "上传文件" + src.getOriginalFilename() + "失败");
        }
        user.getMessages().addFirst("时间：" + new Date() + "文件处理完毕。");
    }

    @Override
    public void savePicture(User user, Game game, HttpSession session, MultipartFile[] files) {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\public\\pictures\\";
        /* String filePath = session.getServletContext().getRealPath("/pictures/"); */
        for (MultipartFile multipartFile : files) {
            if (!multipartFile.isEmpty()) {
                //处理图片名字
                String fileType = Utils.getFileType(multipartFile.getOriginalFilename());
                String fileName = game.getId() + "_" + pictureDao.getPictureNum(game) + fileType;
                File file = new File(filePath + fileName);
                try {
                    System.out.println(file);
                    System.out.println(game.getId());
                    System.out.println(file.getName());
                    multipartFile.transferTo(file);
                    pictureDao.insert(new Picture(game.getId(), file.getName(), file.getName()));
                } catch (IOException e) {
                    user.getMessages().addFirst("时间：" + new Date() + "上传文件" + multipartFile.getOriginalFilename() + "失败");
                }
                user.getMessages().addFirst("时间：" + new Date() + "文件处理完毕。");
            }
        }
    }

    @Override
    public void updatePicture(User user, Game game, HttpSession session, MultipartFile[] files) {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\public\\pictures\\";
        /* String filePath = session.getServletContext().getRealPath("/pictures/"); */
        List<Picture> pidList = pictureDao.selectIdByGameId(new Picture(game.getId()));
        int i = 0;
        for (MultipartFile multipartFile : files) {

            if (!multipartFile.isEmpty()) {
                //处理图片名字
                Picture picture = pidList.get(i);
                String fileType = Utils.getFileType(multipartFile.getOriginalFilename());
                String fileName = game.getId() + "_" + i + fileType;
                File file = new File(filePath + fileName);
                try {
                    multipartFile.transferTo(file);
                    pictureDao.update(new Picture(picture.getId(),game.getId(), file.getName(), file.getName()));
                } catch (IOException e) {
                    user.getMessages().addFirst("时间：" + new Date() + "上传文件" + multipartFile.getOriginalFilename() + "失败");
                }
                user.getMessages().addFirst("时间：" + new Date() + "文件处理完毕。");
                i++;
            }
        }
    }


}
