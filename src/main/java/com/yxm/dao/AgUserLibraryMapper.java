package com.yxm.dao;


import com.yxm.vo.Library;

public interface AgUserLibraryMapper {

    int deleteByPrimaryKey(String id);

    int insert(Library record);

    int insertSelective(Library record);

    Library selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Library record);

    int updateByPrimaryKey(Library record);
}
