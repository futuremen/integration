package com.shigen.wang.service.impl;

import com.google.common.collect.Lists;
import com.shigen.wang.jooq.tables.pojos.User;
import com.shigen.wang.jooq.tables.records.UserRecord;
import com.shigen.wang.service.UserService;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shigen.wang 2019/09/02
 *
 * @author shigen.wang
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DSLContext userDsl;
    com.shigen.wang.jooq.tables.User u = com.shigen.wang.jooq.tables.User.USER;

    @Override
    public int createUser(User user) {
        UserRecord record = new UserRecord();
        record.setName(user.getName());
        record.setEmail(user.getEmail());
        record.setGender(user.getGender());
        return userDsl.insertInto(u).set(record).execute();
    }

    @Override
    public int deleteUserById(Integer id) {
        List<Condition> conds = Lists.newArrayList();
        conds.add(u.ID.eq(id));
        return userDsl.delete(u).where(conds).execute();
    }

    @Override
    public int updateUser(User user) {
        UserRecord record = new UserRecord();
        record.setName(user.getName());
        record.setEmail(user.getEmail());
        record.setGender(user.getGender());
        return userDsl.executeUpdate(record);
    }

    @Override
    public User findUserById(Integer id) {
        List<Condition> conds = Lists.newArrayList();
        conds.add(u.ID.eq(id));
        return userDsl.selectFrom(u).where(conds).fetchInto(User.class).get(0);
    }

    @Override
    public List<User> findUserAll() {
        return userDsl.selectFrom(u).fetchInto(User.class);
    }
}
