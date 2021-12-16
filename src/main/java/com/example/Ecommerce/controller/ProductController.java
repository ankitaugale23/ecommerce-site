package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products/dairy")
    public String showDairyProducts(){
        return "These are dairy products";
    }
    @GetMapping("/products/farm")
    public String showFarmProducts(){
        return "These are farm prodcuts";
    }
}
