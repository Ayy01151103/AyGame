package com.yxm.dao;


import com.yxm.vo.Picture;

public interface AgGamePictureMapper {

    int deleteByPrimaryKey(String id);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}
