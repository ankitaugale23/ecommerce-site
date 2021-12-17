package com.example.Ecommerce.service;

import com.example.Ecommerce.model.User;
import com.example.Ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> retrieveUsers(){
        List<User> users = repository.findAll();
        return users;
    }

    public User addOb(User sr){
        return repository.save(sr);
    }

    public User validateLogin(String name, String pass){
        User ref = repository.findByNameAndPassword(name, pass);
        return ref;
    }

}
