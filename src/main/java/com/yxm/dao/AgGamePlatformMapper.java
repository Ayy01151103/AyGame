package com.yxm.dao;


import com.yxm.vo.Platform;

public interface AgGamePlatformMapper {

    int deleteByPrimaryKey(String id);

    int insert(Platform record);

    int insertSelective(Platform record);

    Platform selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Platform record);

    int updateByPrimaryKey(Platform record);
}
