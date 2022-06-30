package com.yxm.service;


import com.yxm.vo.Library;
import com.yxm.vo.PageData;
import com.yxm.vo.PageWrap;

import java.util.List;

/**
 * 用户所属游戏Service定义
 *
 * @author 阿咿呀羊
 * @date 2022/03/12 03:03
 */
public interface AgUserLibraryService {

    /**
     * 创建
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    String create(Library agUserLibrary);

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
    void updateById(Library agUserLibrary);

    /**
     * 批量主键更新
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    void updateByIdInBatch(List<Library> agUserLibrarys);

    /**
     * 主键查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Library findById(String id);

    /**
     * 条件查询单条记录
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    Library findOne(Library agUserLibrary);

    /**
     * 条件查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    List<Library> findList(Library agUserLibrary);

    /**
     * 分页查询
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    PageData<Library> findPage(PageWrap<Library> pageWrap);

    /**
     * 条件统计
     *
     * @author 阿咿呀羊
     * @date 2022/03/12 03:03
     */
    long count(Library agUserLibrary);
}
