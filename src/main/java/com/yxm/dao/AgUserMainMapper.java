package com.yxm.dao;


import com.yxm.vo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author panyang
 */
@Repository
@Mapper
public interface AgUserMainMapper {


    @Delete("delete from user where id = #{id}")
    int deleteByPrimaryKey(Integer id);

    @Insert("insert into user (id,name,password,money,register_date,is_admin) value (#{id},#{name},#{password},#{money},#{registerDate},#{isAdmin})")
    void insert(User record);

    int insertSelective(User record);

    @Select(" select * from user where id = #{id}")
    User selectByPrimaryKey(Integer id);

    @Update(" update user set " +
            "name = #{name} ," +
            "password = #{password} , " +
            "money = #{money} ," +
            "is_admin = #{isAdmin} " +
            "where id = #{id}")
    int updateByPrimaryKeySelective(User record);

    /*int updateByPrimaryKey(User record)*/;

    @Select("select * from user")
    List<User> selectAllUsers();

    @Select("select * from user where name = #{name}")
    List<User> selectUserName(String name);

    @Select("select * from user where name like #{name}")
    List<User> selectByName(User agUserMain);
}
