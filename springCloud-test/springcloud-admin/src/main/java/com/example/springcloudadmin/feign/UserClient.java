package com.example.springcloudadmin.feign;

import com.example.springcloudadmin.feign.impl.UserClientBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: levy
 * @Date: 2021/3/16 17:45
 */
@FeignClient(name = "springcloud-user",fallback = UserClientBack.class)
public interface UserClient {

    @GetMapping("/springcloudUser/user/getUser")
    String getUser();

    @GetMapping("/springcloudUser/user/getLevy")
    String getLevy();



}
