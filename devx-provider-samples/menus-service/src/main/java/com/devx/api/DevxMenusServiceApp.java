package com.devx.api;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sungang on 2017/12/6.
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.devx.mapper")
@ComponentScan("com.devx")
@EnableFeignClients
public class DevxMenusServiceApp {


    public static void main(String[] args) {
        SpringApplication.run(DevxMenusServiceApp.class, args);
    }
}
