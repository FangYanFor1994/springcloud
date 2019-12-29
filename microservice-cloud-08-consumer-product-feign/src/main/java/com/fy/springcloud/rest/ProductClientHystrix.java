package com.fy.springcloud.rest;

import com.fy.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: springCloud->ProductClientHystrix
 * @description: Feign客户端熔断类
 * @author: fangyan
 * @create: 2019-12-29 22:57
 **/
@Component
public class ProductClientHystrix implements ProductClient{
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "id="+id+"不存在--FeignClient&hystrix", "无数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
