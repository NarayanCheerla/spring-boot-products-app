package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

//    List<Product> products = Arrays.asList(new Product(101, "IPhone", 50000), new Product(102, "Samsung", 70000), new Product(103, "Nokia", 12000));

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public void saveProduct(Product product){
        repo.save(product);
    }

    public Product getProduct(int id){
        return repo.findById(id).get();
    }

    public void deleteProduct(int id){
        repo.deleteById(id);
    }

    public Product updateProduct(Product product){
        return repo.save(product);
    }
}
