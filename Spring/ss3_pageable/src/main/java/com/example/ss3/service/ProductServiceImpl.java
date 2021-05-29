package com.example.ss3.service;

import com.example.ss3.entity.ProductEntity;
import com.example.ss3.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getProductByName(String name, Pageable pageable) {
        return productRepo.findAllByName(name,pageable);
    }

    @Override
    public List<ProductEntity> getAllProduct(Pageable pageable) {
        return productRepo.findAll(pageable).getContent();
    }
}
