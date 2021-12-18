package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

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

    public List<String> retrieveBrandFromId(Integer id){
        List<String> ref = repo.findBrandFromId(id);
        return ref;
    }

}
