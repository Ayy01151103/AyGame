package com.yxm.dao;

import com.yxm.vo.Game;
import com.yxm.vo.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PictureDao {
    int getPictureNum(Game game);

    int insert(@Param("pojo") Picture pojo);

    int insertSelective(@Param("pojo") Picture pojo);

    int insertList(@Param("pojos") List<Picture> pojo);

    int update(@Param("pojo") Picture pojo);

    List<Picture> selectIdByGameId(Picture picture);
}
