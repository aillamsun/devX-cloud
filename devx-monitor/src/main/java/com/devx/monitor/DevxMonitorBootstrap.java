package com.devx.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by sungang on 2017/12/5.
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class DevxMonitorBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(DevxMonitorBootstrap.class, args);
    }
}
