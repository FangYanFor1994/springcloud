package com.fy.springcloud.service;

import com.fy.springcloud.entities.Product;

import java.util.List;

public interface ProductService {

    boolean add(Product product);
    Product get(Long id);
    List<Product> list();
}
