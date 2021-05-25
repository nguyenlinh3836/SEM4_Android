package com.example.ss1.Service;

import com.example.ss1.Entity.UserEntity;
import com.example.ss1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepo;
    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepo.save(userEntity);
    }

    @Override
    public List<UserEntity> listUser() {
        return userRepo.findAll();
    }
}
