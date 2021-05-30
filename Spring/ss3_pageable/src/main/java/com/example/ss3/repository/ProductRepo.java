package com.example.ss3.repository;

import com.example.ss3.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
    @Query("select p from ProductEntity p where p.name like %:name%")
    List<ProductEntity>findAllByName(String name, Pageable pageable);
}
