package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;


    public List<String> retrieveProductByName() {
        List<String> ref= repo.find();
        return ref;
    }
    public List<Pair<Integer,String>> retrieveByType(int type){
        List<Object[]> ref = repo.findByType(type);
        List<Pair<Integer,String>> pairs = new ArrayList<Pair<Integer,String>>();
        for(int i=0;i<ref.size();i++)
        {
            Object[] user = ref.get(i);
            Integer pid = (Integer) user[0];
            String name = (String) user[1];
            pairs.add(Pair.of(pid,name));
        }
        return pairs;
    }

    public Integer retrieveIdFromName(String name){
        Integer id = repo.findIfFromName(name);
        return  id;
    }

    public List<Pair<String, BigDecimal>> retrieveBrandFromId(Integer id){
        List<Object[]> ref = repo.findBrandFromId(id);
        List<Pair<String,BigDecimal>> brands  = new ArrayList<Pair<String,BigDecimal>>();
        for(int i=0;i<ref.size();i++){
            Object[] brand = ref.get(i);
            String name = (String) brand[0];
            BigDecimal price = (BigDecimal) brand[1];
            brands.add(Pair.of(name,price));
        }
        return brands;
    }

}
