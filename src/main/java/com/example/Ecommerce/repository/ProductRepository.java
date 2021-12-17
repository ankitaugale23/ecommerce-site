package com.example.Ecommerce.repository;


import com.example.Ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(value = "select name from product ", nativeQuery = true)
    public List<String> find();


    @Query(value = "select name from product where type=?",nativeQuery = true)
    public List<String> findByType(int type);
}
