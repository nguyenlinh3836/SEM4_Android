package com.example.ss2.service;

import com.example.ss2.entity.ProductEntity;
import com.example.ss2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public int getTotalPage(Pageable pageable) {
        return productRepo.findAll(pageable).getTotalPages();
    }

    @Override
    public List<ProductEntity> getAllProducts(Pageable pageable) {
        return productRepo.findAll(pageable).getContent();
    }

    @Override
    public Page<ProductEntity> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1,pageSize);
        return productRepo.findAll(pageable);
    }

    @Override
    public ProductEntity createProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
    @Override
    public ProductEntity getById(int id) {
        Optional< ProductEntity > optional = productRepo.findById(id);
        ProductEntity productEntity = null;
        if (optional.isPresent()) {
            productEntity = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return productEntity;
    }
}
