package com.yxm.mapper;


import com.yxm.vo.Game;
import com.yxm.vo.Header;
import com.yxm.vo.Review;
import com.yxm.vo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Mapper
public interface UserMapper {


    @Select("select * from header where id = #{id}")
    Header selectHeader();

    @Select("select t1.* from game as t1 inner join library as t2 where t2.user_id = #{id} and t1.id = t2.game_id")
    Game selectGames();

    @Select("select * from review where user_id = #{id}")
    Review selectReviews();

    @Select("<script>" +
            "select * from user " +
            "<where>" +
            "<if test='id!=null and id!=0'>id=#{id}</if>" +
            "<if test='name !=null'> and name =#{name}</if>" +
            "</where> " +
            "limit 0 ,1" +
            "</script>")
    User checkUserName(User user);

    @Select("<script>" +
            "select * from user " +
            "<where>" +
            "<if test='id!=null'>id=#{id}</if>" +
            "<if test='id!=null and name !=null'>and name = #{name}</if>" +
            "</where>" +
            "</script>")
    User getUser(User user);

    @Insert("insert into user (name,password,register_date,is_admin) values (#{name},#{password},#{registerDate},#{isAdmin})")
    int insertUser(User user);

    @Select("select * from user where id = #{id}")
    public User getUserById(Integer id);

    @Delete("delete from user where id = #{id}")
    public int deleteUserById(Integer id);

    @Update("update user set name = #{name},password = #{password},register_Date = #{registerDate},is_Admin = #{isAdmin} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUser(User user);

    @Update("update user set money = money + #{money}" +
            "where id = #{user.id}")
    int recharge(@Param("user") User user, @Param("money") double rmb);

    @Update("update user set money = money - #{money}" +
            "where id = #{user.id}")
    int pay(@Param("user") User user, @Param("money") double rmb);


    @Select("select * from user")
    public Collection<User> getAllUser();


}
