package com.codecool.controller;

import com.codecool.model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {

    @GetMapping
    public Cart getCart(){
        return null;
    }

    @PostMapping("/add/item")
    public void addToCart(){

    }

    @DeleteMapping("/delete")
    public void deleteCart(){

    }

    @PostMapping("/edit")
    public void editCart(){

    }


}
