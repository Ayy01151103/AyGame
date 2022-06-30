package com.yxm.dao;

import com.yxm.vo.Game;
import com.yxm.vo.Library;
import com.yxm.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LibraryDao {
    int getSales(Game game);

    Library check(@Param("user") User user, @Param("game") Game game);

    int add(@Param("user") User user, @Param("game") Game game);

    int delete(@Param("user") User user, @Param("game") Game game);

    int insert(@Param("pojo") Library pojo);

    int insertSelective(@Param("pojo") Library pojo);

    int insertList(@Param("pojos") List<Library> pojo);

    int update(@Param("pojo") Library pojo);
}
