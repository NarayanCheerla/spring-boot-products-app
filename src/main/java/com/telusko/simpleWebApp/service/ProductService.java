package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "IPhone", 50000), new Product(102, "Samsung", 70000), new Product(103, "Nokia", 12000));

    public List<Product> getProducts(){
        return products;
    }
}
