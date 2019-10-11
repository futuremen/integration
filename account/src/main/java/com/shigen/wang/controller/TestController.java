package com.shigen.wang.controller;

import com.google.gson.Gson;
import com.shigen.wang.jooq.tables.pojos.User;
import com.shigen.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shigen.wang 2019/09/03
 *
 * @author shigen.wang
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String test(){
        User u = userService.findUserById(1);
        return new Gson().toJson(u);
    }
}
