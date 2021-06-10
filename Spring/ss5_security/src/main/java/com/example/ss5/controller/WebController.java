package com.example.ss5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping({"/","/index"})
    public String index(){
        return "index";
    }
    @GetMapping("/admin")
    private String admin() {
        return "admin";
    }

    @GetMapping("/user")
    private String user() {
        return "user";
    }

    @GetMapping("/error")
    private String error() {
        return "error";
    }

}
