package com.example.springcloudadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author levy
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringcloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAdminApplication.class, args);
    }

}
