package com.fy.springcloud.controller;

import com.fy.springcloud.entities.Product;
import com.fy.springcloud.rest.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: springCloud->ProductController_consumer
 * @description: 控制层
 * @author: fangyan
 * @create: 2019-12-28 01:21
 **/
@RestController
public class ProductController_consumer {

    @Autowired
    ProductClient productClient;

    @RequestMapping("/consumer/product/get/{id}")
    public Product getProduct(@PathVariable("id") Long id){
        return productClient.get(id);
    }

    @RequestMapping("/consumer/product/list")
    public List<Product> getProduct(){
        return productClient.list();
    }

    @RequestMapping("/consumer/product/add")
    public boolean add(Product product){
        return productClient.add(product);
    }

}
