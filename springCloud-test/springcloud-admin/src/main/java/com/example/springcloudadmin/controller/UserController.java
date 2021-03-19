package com.example.springcloudadmin.controller;

import com.example.springcloudadmin.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: levy
 * @Date: 2021/3/16 17:47
 */
@RestController
@RequestMapping("/userClient")
public class UserController {

    @Qualifier("com.example.springcloudadmin.feign.UserClient")
    @Autowired
    private  UserClient userClient;

    @GetMapping("/getU")
    public String getU(){
        return userClient.getUser();
    }

    @GetMapping("/getLevy")
    public String getLevy(){
        return userClient.getLevy();
    }

}
