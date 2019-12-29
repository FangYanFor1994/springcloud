package com.fy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program: springCloud->MicroserviceProductProvider_8001
 * @description: 启动类
 * @author: fangyan
 * @create: 2019-12-28 01:07
 **/
@EnableHystrix //开启对熔断器的支持
@EnableEurekaClient //标识该微服务为eureka客户端,将注册进eureka服务注册中心
@MapperScan("com.fy.springcloud.mapper")
@SpringBootApplication
public class MicroserviceProductProvider_hystrix {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProductProvider_hystrix.class,args);
    }
}
