package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.model.User;
import com.example.Ecommerce.service.ProductService;
import com.example.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/insertuser")
    public String insertName(@RequestParam(name = "username")String username,@RequestParam(name = "pass") String password) {
        User user = new User(username,password);
        service.addOb(user);
        if(username=="" && password=="" ){
            System.out.println("please insert data");
            return "register.html";

        }

        System.out.println("name" +username +"password"  +password);
        return "Registeration Succesfull ";
//

    }
}
