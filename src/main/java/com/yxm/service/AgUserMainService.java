package com.yxm.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxm.vo.PageData;
import com.yxm.vo.PageWrap;
import com.yxm.vo.User;

import java.util.List;

/**
 * 用户Service定义
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 */
public interface AgUserMainService {

    /**
     * 创建
     *
     * @return
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Integer create(User agUserMain);

    /**
     * 创建
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void insert(User agUserMain);

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
    void deleteByIdInBatch(List<String> ids);

    /**
     * 主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void updateById(User agUserMain);

    /**
     * 批量主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void updateByIdInBatch(List<User> agUserMains);

    /**
     * 主键查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    User findById(Integer id);

    /**
     * 条件查询单条记录
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    User findOne(User agUserMain);

    /**
     * 条件查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    List<User> findList(User agUserMain);

    /**
     * 分页查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    PageData<User> findPage(PageWrap<User> pageWrap);

    /**
     * 条件统计
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    long count(User agUserMain);

    /**
     * 查询所有用户
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    List<User> findAllUsers();


}
