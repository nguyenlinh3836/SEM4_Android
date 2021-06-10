package com.example.apisecurity.service;

import com.example.apisecurity.entity.UserEntity;

public interface UserService {
    UserEntity login(String username, String password);
    UserEntity findUserByToken(String token);
    UserEntity findUserByUsername(String username);
    UserEntity saveUser(UserEntity userEntity);
}
