package com.example.springclouduser.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: levy
 * @Date: 2021/3/16 17:28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${user.url}")
    private String url;

    @GetMapping("/getUser")
    public String getUser(){
        return url;
    }

    @GetMapping("/getLevy")
    public String getLevy(){
        return "www.levy.net";
    }


}
