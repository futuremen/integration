package com.shigen.wang.service;

import com.shigen.wang.jooq.tables.pojos.User;

import java.util.List;

/**
 * Created by shigen.wang 2019/09/02
 *
 * @author shigen.wang
 */
public interface UserService {

    int createUser(User user);

    int deleteUserById(Integer id);

    int updateUser(User user);

    User findUserById(Integer id);

    List<User> findUserAll();
}
