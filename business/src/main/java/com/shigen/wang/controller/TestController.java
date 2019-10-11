package com.shigen.wang.controller;

import com.shigen.wang.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shigen.wang 2019/09/04
 *
 * @author shigen.wang
 */
@RestController
public class TestController {

    @Autowired
    private UserClient userClient;

    @GetMapping("test")
    public String test(){
        return userClient.createUser()+"";
    }
    @GetMapping("test2")
    public String test2(){
        System.out.println("hello world.....");
        return "hello world";
    }

}
