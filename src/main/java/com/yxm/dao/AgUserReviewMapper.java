package com.yxm.dao;


import com.yxm.vo.Review;

public interface AgUserReviewMapper {
    int deleteByPrimaryKey(String id);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}
