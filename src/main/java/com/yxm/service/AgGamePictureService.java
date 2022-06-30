package com.yxm.service;


import com.yxm.vo.PageData;
import com.yxm.vo.PageWrap;
import com.yxm.vo.Picture;

import java.util.List;

/**
 * 游戏所属图片Service定义
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 */
public interface AgGamePictureService {

    /**
     * 创建
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    String create(Picture agGamePicture);

    /**
     * 主键删除
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void deleteById(String id);

    /**
     * 批量主键删除
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void deleteByIdInBatch(List<String> ids);

    /**
     * 主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void updateById(Picture agGamePicture);

    /**
     * 批量主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void updateByIdInBatch(List<Picture> agGamePictures);

    /**
     * 主键查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Picture findById(String id);

    /**
     * 条件查询单条记录
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Picture findOne(Picture agGamePicture);

    /**
     * 条件查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    List<Picture> findList(Picture agGamePicture);

    /**
     * 分页查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    PageData<Picture> findPage(PageWrap<Picture> pageWrap);

    /**
     * 条件统计
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    long count(Picture agGamePicture);
}
