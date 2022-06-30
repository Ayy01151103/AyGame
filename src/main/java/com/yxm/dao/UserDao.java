package com.yxm.dao;

import com.yxm.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户dao接口
 */
@Repository
@Mapper
public interface UserDao {
    User checkUserName(User user);

    User getUser(User user);

    List<User> getNewUser();

    List<User> getAllUser();

    User getUserById(Integer id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(User user);

    int recharge(@Param("user") User user, @Param("money") double rmb);

    int pay(@Param("user") User user, @Param("money") double rmb);

}
