package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {


    @Autowired
    ProductService service;

    @GetMapping("/products/dairy")
    public String showDairyProducts(){
       List<String> products = service.retrieveByType(2);
       return "dairyproduct.html";

    }

    @GetMapping("/products/farm")
    public String showFarmProducts() {
        List<String> products = service.retrieveByType(1);
        return "farmproduct";
    }

    @GetMapping("/homepage")
    public List<String> retrieveProducts( ) {
        List<String> products = service.retrieveProductByName();
        return products;
    }

}
