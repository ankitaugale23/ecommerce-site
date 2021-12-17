package com.example.Ecommerce.repository;

import com.example.Ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {


    public User findByNameAndPassword(String name, String password);
}
