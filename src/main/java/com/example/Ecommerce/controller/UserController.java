package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.model.User;
import com.example.Ecommerce.service.ProductService;
import com.example.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @Autowired
    ProductService services1;


    @GetMapping("/users")
    public List<User> showUsers(){
        List<User> users = service.retrieveUsers();
        return users;
    }

    @GetMapping("/homepage")
    public List <String> retrieveProducts( ){
        List<String> products= services1.retrieveProductByName();
        return products;
    }
}
