package com.example.ss2.repository;

import com.example.ss2.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
