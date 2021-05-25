package com.example.ss1.Service;

import com.example.ss1.Entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity userEntity);
    List<UserEntity> listUser();
}
