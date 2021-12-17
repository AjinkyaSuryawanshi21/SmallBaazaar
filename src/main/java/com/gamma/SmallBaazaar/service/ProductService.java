package com.gamma.SmallBaazaar.service;

import com.gamma.SmallBaazaar.model.Product;
import com.gamma.SmallBaazaar.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo ref;

    public List<Product> getAll(){
        List<Product> products = ref.findAll();
//        System.out.println(products.get(0).getFpname());
        return products;
    }

    public Product getProductById(int id){
        Product product = ref.findById(id).get();
        return product;
    }
}
