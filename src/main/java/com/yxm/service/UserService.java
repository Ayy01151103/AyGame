package com.yxm.service;


import com.yxm.vo.User;

import java.util.List;

/**
 * 示例Service定义
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 13:50
 */
public interface UserService {

    /**
     * 创建
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    Integer create(User user);

    /**
     * 主键删除
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    void deleteById(Integer id);

    /**
     * 批量主键删除
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    void deleteByIdInBatch(List<Integer> ids);

    /**
     * 主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    void updateById(User user);

    /**
     * 批量主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    void updateByIdInBatch(List<User> users);

    /**
     * 主键查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    User findById(Integer id);

    /**
     * 条件查询单条记录
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    User findOne(User user);

    /**
     * 条件查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    List<User> findList(User user);

    /**
     * 分页查询
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    /* PageData<User> findPage(PageWrap<User> pageWrap);*/

    /**
     * 条件统计
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 13:50
     */
    long count(User user);
}
