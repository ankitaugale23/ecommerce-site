package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {


    @Autowired
    ProductService service;

    @GetMapping("/products/dairy/{id}")
    public String showDairyProducts(@PathVariable("id") int id, Model model){
       List<String> products = service.retrieveByType(id);
       model.addAttribute("dairyproducts",products);
       return "dairyproduct.html";

    }

    @GetMapping("/products/farm/{id}")
    public String showFarmProducts(@PathVariable("id") int id, Model model) {
        List<String> products = service.retrieveByType(id);
        model.addAttribute("farmproducts",products);
        return "farmproduct.html";
    }

    @GetMapping("/homepage")
    public List<String> retrieveProducts( ) {
        List<String> products = service.retrieveProductByName();
        return products;
    }

}
