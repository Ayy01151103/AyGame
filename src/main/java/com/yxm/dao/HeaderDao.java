package com.yxm.dao;

import com.yxm.vo.Header;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HeaderDao {
    int insert(@Param("pojo") Header pojo);

    int insertSelective(@Param("pojo") Header pojo);

    int insertList(@Param("pojos") List<Header> pojo);

    int update(@Param("pojo") Header pojo);
}
