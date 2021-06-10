package com.example.apisecurity.controller;

import com.example.apisecurity.entity.UserEntity;
import com.example.apisecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index() {
        return "Hello";
    }

    @GetMapping("/api/home")
    public String home() {
        return "Home";
    }

    @PostMapping("/api/register")
    public ResponseEntity register(@RequestBody UserEntity userEntity) {
        UserEntity user = userService.saveUser(userEntity);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/api/public")
    public String demo() {
        return "public";
    }

    @PostMapping("/token")
    public ResponseEntity login(@RequestParam("username") String username, @RequestParam("password") String password) {
        UserEntity userEntity = userService.login(username, password);
        if (userEntity == null) {
            return ResponseEntity.ok("Username or password invalid");
        }
        return ResponseEntity.ok(userEntity);
    }
}
