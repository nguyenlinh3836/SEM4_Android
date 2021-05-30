package com.example.ss3.service;

import com.example.ss3.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getProductByName(String name, Pageable pageable);
    List<ProductEntity> getAllProduct(Pageable pageable);
    Page<ProductEntity> findPaginated(int pageNo, int pageSize);
}
