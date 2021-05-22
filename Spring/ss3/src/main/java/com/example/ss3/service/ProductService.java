package com.example.ss3.service;

import com.example.ss3.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProduct();

    ProductEntity getProductById(int id);

    List<ProductEntity> getProductByNameCustom(String name);

    ProductEntity createProduct(ProductEntity p);

    ProductEntity updateProduct(ProductEntity p);

    void deleteProduct(int id);
}
