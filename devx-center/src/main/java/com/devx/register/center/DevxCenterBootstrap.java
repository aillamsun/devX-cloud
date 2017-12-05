package com.devx.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sungang on 2017/12/5.
 */
@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class DevxCenterBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(DevxCenterBootstrap.class, args);
    }
}
