package com.example.apisecurity.repository;

import com.example.apisecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
    UserEntity findByUsernameAndPassword(String username, String password);
    UserEntity findByToken(String token);
}
