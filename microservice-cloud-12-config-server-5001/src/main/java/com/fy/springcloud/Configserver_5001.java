package com.fy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: springCloud->Configserver_5001
 * @description: 配置中心启动类
 * @author: fangyan
 * @create: 2019-12-31 22:56
 **/
@EnableConfigServer //开启配置中心功能
@SpringBootApplication
public class Configserver_5001 {
    public static void main(String[] args) {
        SpringApplication.run(Configserver_5001.class, args);
    }
}
