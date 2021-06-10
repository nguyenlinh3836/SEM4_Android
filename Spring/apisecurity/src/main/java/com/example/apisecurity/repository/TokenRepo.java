package com.example.apisecurity.repository;

import com.example.apisecurity.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepo extends JpaRepository<TokenEntity, Integer> {
    TokenEntity findByToken(String token);
}
