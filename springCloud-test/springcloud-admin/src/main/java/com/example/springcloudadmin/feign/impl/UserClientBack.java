package com.example.springcloudadmin.feign.impl;

import com.example.springcloudadmin.feign.UserClient;
import org.springframework.stereotype.Component;

/**
 * @Author: levy
 * @Date: 2021/3/17 18:03
 */
@Component
public class UserClientBack implements UserClient {
    @Override
    public String getUser() {
        return "服务调用失败";
    }

    @Override
    public String getLevy() {
        return "服务调用失败";
    }
}
