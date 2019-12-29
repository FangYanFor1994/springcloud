package com.fy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: springCloud->ProductConsumer_80
 * @description: 启动类
 * @author: fangyan
 * @create: 2019-12-28 01:29
 **/
@EnableFeignClients(basePackages = "com.fy.springcloud.rest") //开启feign客户端并指定feign接口所在包
@EnableEurekaClient //标识为Eureka客户端
@SpringBootApplication
public class ProductConsumer_feign {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_feign.class, args);
    }
}
