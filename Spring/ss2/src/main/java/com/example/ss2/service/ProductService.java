package com.example.ss2.service;

import com.example.ss2.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts(Pageable pageable);
    int getTotalPage(Pageable pageable);
    Page<ProductEntity> findPaginated(int pageNo, int pageSize);
    ProductEntity createProduct(ProductEntity p);
    ProductEntity updateProduct(ProductEntity p);
    void deleteProduct(int id);
    ProductEntity getById(int id);
}
