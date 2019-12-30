package com.fy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: springCloud->ZuulServer_7001
 * @description: zuul启动类
 * @author: fangyan
 * @create: 2019-12-30 23:51
 **/
@EnableZuulProxy  //开启zuul的功能
@SpringBootApplication
public class ZuulServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer_7001.class, args);
    }
}
