package com.yxm.service;


import com.yxm.vo.Game;
import com.yxm.vo.PageData;
import com.yxm.vo.PageWrap;
import com.yxm.vo.User;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 游戏Service定义
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 */
public interface AgGameMainService {

    /**
     * 创建
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     * @return
     */
    Integer create(Game agGameMain);

    /**
     * 主键删除
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void deleteById(Integer id);

    /**
     * 批量主键删除
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void deleteByIdInBatch(List<Integer> ids);

    /**
     * 主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void updateById(Game agGameMain);

    /**
     * 批量主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void updateByIdInBatch(List<Game> agGameMains);

    /**
     * 主键查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Game findById(String id);

    /**
     * 条件查询单条记录
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Game findOne(Game agGameMain);

    /**
     * 条件查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    List<Game> findList(Game agGameMain);

    /**
     * 分页查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    PageData<Game> findPage(PageWrap<Game> pageWrap);

    /**
     * 条件统计
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    long count(Game agGameMain);

    /**
     * 查询所有游戏
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    List<Game> findAllGames(Game game);

    /**
     * 保存封面
     * @param user
     * @param game
     * @param src
     */
    void savePoster(User user, Game game, MultipartFile src);

    /**
     * 保存详情页图片
     * @param user
     * @param game
     * @param session
     * @param files
     */
    void savePicture(User user, Game game, HttpSession session, MultipartFile[] files);

    /**
     * 更新详情页图片
     * @param user
     * @param game
     * @param session
     * @param files
     */
    void updatePicture(User user, Game game, HttpSession session, MultipartFile[] files);
}
