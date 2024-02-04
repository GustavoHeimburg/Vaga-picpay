package com.example.vagapicpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @PostMapping("/login")
    public String login(String username, String password) {
        return "redirect:/home";
    }

    @PostMapping("/register")
public String register (String newUserName, String newPassword){
return "redirect:/home";
    }

@RequestMapping("/home")
public String home(){
    return "home";
}
    }