package com.yxm.dao;


import com.yxm.vo.Header;

public interface AgUserHeaderMapper {

    int deleteByPrimaryKey(String id);

    int insert(Header record);

    int insertSelective(Header record);

    Header selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Header record);

    int updateByPrimaryKey(Header record);
}
