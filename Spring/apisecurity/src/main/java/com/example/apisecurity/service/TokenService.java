package com.example.apisecurity.service;

import com.example.apisecurity.entity.TokenEntity;
import com.example.apisecurity.entity.UserEntity;

public interface TokenService {
    UserEntity findUserByToken(String token);
    TokenEntity createToken(int userID);
}
