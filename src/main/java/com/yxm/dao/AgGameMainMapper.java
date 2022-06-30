package com.yxm.dao;


import com.yxm.vo.Game;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author panyang
 */
@Repository
@Mapper
public interface AgGameMainMapper {

   /* @Results(id = "simpleGameMap",value = {
            @Result(column="id",property = "id",id=true),
            @Result( property="category" ,column="category_id",javaType = Category.class,one=@One(select = "com."))
    })*/

    @Delete("delete from game where id = #{id}")
    int deleteByPrimaryKey(Integer id);

    @Insert("insert into game (id,name,category_id,platform_id,price,description,details,pubdate,src) value (#{id},#{name},#{category_id},#{platform_id},#{price},#{description},#{details},#{pubdate},#{src})")
    int insert(Game record);

    int insertSelective(Game record);

    /*@Select("select game.id,game.name,category.name as category,platform.name as platform,game.price,game.description,game.pubdate,game.src,game.details  from game LEFT JOIN category ON game.category_id = category_id LEFT JOIN platform ON game.platform_id = platform.id")*/
    @Select("select * from game where name like #{name} and category_id = #{categoryId} and platform_id = #{platformId}")
    List<Game> selectAllGames();

    @Select("select * from game where name like #{name} or like #{category_id} or like #{platform_id}")
    List<Game> selectGamesByCondition(Game record);

    int updateByPrimaryKeySelective(Game record);

    @Update("update game set name = #{name},category_id = #{category_id},platform_id = #{platform_id},price = #{price},description = #{description},pubdate = #{pubdate},src = #{src},details = #{details}")
    int updateByPrimaryKey(Game record);
}
