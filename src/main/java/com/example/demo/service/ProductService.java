package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;



public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
