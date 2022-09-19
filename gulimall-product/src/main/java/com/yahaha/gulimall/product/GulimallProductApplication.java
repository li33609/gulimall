package com.yahaha.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *     1)导入依赖
 *     2）配置
 *        数据源
 *        配置 mybatis-plus
 */

@MapperScan("com.yahaha.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
