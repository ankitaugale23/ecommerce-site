package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.User;
import com.example.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SiteController {

    @Autowired
    UserService service;

    @GetMapping("/users")
    public List<User> showUsers(){
        List<User> users = service.retrieveUsers();
        return users;
    }

    @PostMapping("/insertuser")
    public String inserUsers(@RequestParam(name="username") String username,@RequestParam(name="pass") String password){
        User ref = service.addOb(new User(username,password));
        return "hello";
    }
}
