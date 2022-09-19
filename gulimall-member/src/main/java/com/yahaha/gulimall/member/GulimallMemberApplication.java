package com.yahaha.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1、想要远程调用
 * 1) 引入open-feign
 * 2) 编写一个接口
 *   1、声明接口的每一个方法
 * 3) 开启远程功能
 */
@EnableFeignClients(basePackages = "com.yahaha.gulimall.member.fegin")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
