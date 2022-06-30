package com.yxm.service;


import com.yxm.vo.Header;
import com.yxm.vo.PageData;
import com.yxm.vo.PageWrap;

import java.util.List;

/**
 * 用户头像Service定义
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 */
public interface AgUserHeaderService {

    /**
     * 创建
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    String create(Header agUserHeader);

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
    void updateById(Header agUserHeader);

    /**
     * 批量主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void updateByIdInBatch(List<Header> agUserHeaders);

    /**
     * 主键查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Header findById(String id);

    /**
     * 条件查询单条记录
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Header findOne(Header agUserHeader);

    /**
     * 条件查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    List<Header> findList(Header agUserHeader);

    /**
     * 分页查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    PageData<Header> findPage(PageWrap<Header> pageWrap);

    /**
     * 条件统计
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    long count(Header agUserHeader);
}
