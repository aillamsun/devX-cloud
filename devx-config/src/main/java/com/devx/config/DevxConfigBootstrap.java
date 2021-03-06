package com.devx.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * 配置中心
 *
 * Created by sungang on 2017/12/6.
 */
@EnableConfigServer
@SpringBootApplication
public class DevxConfigBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(DevxConfigBootstrap.class, args);
    }
}
