package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repo;




    public List<String> retrieveProductByName() {
        List<String> ref= repo.find();
        return ref;
    }
    public List<String> retrieveByType(int type){
        List<String> ref = repo.findByType(type);
        return ref;
    }

}
