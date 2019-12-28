package com.fy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springCloud->Eurekaserver_6001
 * @description: euraka启动类
 * @author: fangyan
 * @create: 2019-12-28 22:00
 **/
@EnableEurekaServer //标识一个eureka server 服务注册中心
@SpringBootApplication
public class Eurekaserver_6002 {
    public static void main(String[] args) {
        SpringApplication.run(Eurekaserver_6002.class, args);
    }
}
