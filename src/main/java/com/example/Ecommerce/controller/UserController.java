package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.model.User;
import com.example.Ecommerce.service.ProductService;
import com.example.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService service;


    @GetMapping("/users")
    public List<User> showUsers(){
        List<User> users = service.retrieveUsers();
        return users;
    }


    @PostMapping("/validate")
    public String validateUser(@RequestParam(name = "username") String name, @RequestParam(name = "password")String password, Model model)
    {
        User ref = service.validateLogin(name, password);
        if(ref != null)
            return "Home.html";
        else {

            model.addAttribute("err","Invalid User");
            return "login.html";

        }

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
        return "login.html";
//

    }

    @GetMapping("/login")
    public String LoginPage(){

        return "login.html";

    }

    @GetMapping("/register")
    public String RegisterPage() {

        return "register.html";
    }

    @GetMapping("/")
    public String ShowHomepage(){
        return  "Home.html";
    }
}
