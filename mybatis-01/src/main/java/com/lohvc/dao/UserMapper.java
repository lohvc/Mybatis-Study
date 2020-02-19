package com.lohvc.dao;

import com.lohvc.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    List<User> getUserLike(String value);

    User getUserById(int id);

    /*insert一个用户*/
    int addUser(User user);

    int addUser2(Map<String,Object> map);

    /*修改用户*/
    int updateUser(User user);

    int deleteUser(int id);
}
