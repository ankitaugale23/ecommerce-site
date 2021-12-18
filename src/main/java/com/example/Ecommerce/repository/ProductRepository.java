package com.example.Ecommerce.repository;


import com.example.Ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Pair;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(value = "select name from product ", nativeQuery = true)
    public List<String> find();


    @Query(value = "select id,name from product where type=?",nativeQuery = true)
    public List<Object[]> findByType(int type);

    @Query(value = "select id from product where name=?",nativeQuery = true)
    public Integer findIfFromName(String name);

    @Query(value = "select name from brand where pid=?",nativeQuery = true)
    public List<String> findBrandFromId(Integer id);
}
