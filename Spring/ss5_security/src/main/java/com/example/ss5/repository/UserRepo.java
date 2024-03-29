package com.example.ss5.repository;

import com.example.ss5.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {
        UserEntity findByUsername(String username);
}
