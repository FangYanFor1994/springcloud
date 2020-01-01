package com.fy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springCloud->EurekaServer_config
 * @description: eureka启动类
 * @author: fangyan
 * @create: 2020-01-01 22:52
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_config {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_config.class, args);
    }
}
