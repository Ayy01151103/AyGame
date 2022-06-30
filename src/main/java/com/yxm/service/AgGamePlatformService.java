package com.yxm.service;


import com.yxm.vo.PageData;
import com.yxm.vo.PageWrap;
import com.yxm.vo.Platform;

import java.util.List;

/**
 * 游戏所属平台Service定义
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 */
public interface AgGamePlatformService {

    /**
     * 创建
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    String create(Platform agGamePlatform);

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
    void updateById(Platform agGamePlatform);

    /**
     * 批量主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void updateByIdInBatch(List<Platform> agGamePlatforms);

    /**
     * 主键查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Platform findById(String id);

    /**
     * 条件查询单条记录
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Platform findOne(Platform agGamePlatform);

    /**
     * 条件查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    List<Platform> findList(Platform agGamePlatform);

    /**
     * 分页查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    PageData<Platform> findPage(PageWrap<Platform> pageWrap);

    /**
     * 条件统计
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    long count(Platform agGamePlatform);
}
