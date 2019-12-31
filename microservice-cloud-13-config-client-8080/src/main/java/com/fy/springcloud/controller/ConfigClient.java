package com.fy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud->ConfigClient
 * @description: 测试从GitHub读取配置信息
 * @author: fangyan
 * @create: 2020-01-01 00:05
 **/
@RestController
public class ConfigClient {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String config(){

        return applicationName+":"+port;
    }
}
