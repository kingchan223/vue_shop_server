package com.backend.vueshop_server.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("api/user/")
public class UserController {

    @PostMapping("login")
    public String login(){
        return "user";
    }

    @PostMapping("logout")
    public String logout(){
        return "userLogout";
    }
}
