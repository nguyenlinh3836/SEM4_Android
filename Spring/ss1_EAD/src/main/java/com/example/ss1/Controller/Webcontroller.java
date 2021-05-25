package com.example.ss1.Controller;

import com.example.ss1.Entity.UserEntity;
import com.example.ss1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Webcontroller {

    @Autowired
    UserService userService;

    @GetMapping({"/", "index"})
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/adduser")
    public String addUser(Model model) {
        UserEntity userEntity = new UserEntity();
        model.addAttribute("user", userEntity);
        return "adduser";
    }

    @GetMapping("/listuser")
    public String listUser(Model model) {
        List<UserEntity> users = userService.listUser();
        model.addAttribute("users", users);
        return "listuser";
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute UserEntity userEntity, Model model) {
        userService.createUser(userEntity);
        return "redirect:/listuser";
    }


}
