package com.yxm.dao;

import com.yxm.vo.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReviewDao {
    int insert(@Param("pojo") Review pojo);

    int insertSelective(@Param("pojo") Review pojo);

    int insertList(@Param("pojos") List<Review> pojo);

    int update(@Param("pojo") Review pojo);
}
