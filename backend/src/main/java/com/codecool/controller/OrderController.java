package com.codecool.controller;

import com.codecool.model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    public List<Cart> getAllOrdersOfUser(){
        return null;
    }
}
