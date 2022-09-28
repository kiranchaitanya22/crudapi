package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    public IProductRepo productRepo;

    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public Optional<Product> productById(int id){
        return productRepo.findById(id);
    }

    public void insertProducts(Product product){
        productRepo.save(product);
    }

    public void deleteProducts(int id){
        productRepo.deleteById(id);
    }

    public String putProducts(Product product){
        int productId=product.getProduct_id();
        if(productRepo.existsById(productId)){
            productRepo.save(product);
            return "Succesful";
        }
        return "Not succesful";

    }
}
