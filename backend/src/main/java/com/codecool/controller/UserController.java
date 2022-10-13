package com.codecool.controller;

import com.codecool.model.RegisteredUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public RegisteredUser getUserData(){
        return null;
    }

    @PostMapping("/edit")
    public void editUserData(){

    }

    @DeleteMapping("/delete")
    public void deleteUser(){

    }

}
