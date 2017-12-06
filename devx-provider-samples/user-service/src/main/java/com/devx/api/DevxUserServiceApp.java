package com.devx.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by sungang on 2017/12/6.
 */
@SpringBootApplication
@EnableEurekaClient
public class DevxUserServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(DevxUserServiceApp.class, args);
    }

}
