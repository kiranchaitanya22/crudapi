package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/kc")
    public String hello(){

        return "KC12";
    }

    @GetMapping("/products")
    public List<Product> products(){
        return productService.getProducts();
    }


    //http://localhost:8080/products/id/101
    @GetMapping("/products/id/{id}")
    public Optional<Product> getProduct(@PathVariable Integer id){

        return productService.productById(id);
    }

    //http://localhost:8080/product?id=101
    @GetMapping("/product")
    public Optional<Product> queryProduct(@RequestParam(name = "id") Integer idVal){

        return productService.productById(idVal);
    }

    @PostMapping("/product")
    public void postProduct(@RequestBody Product p){
        productService.insertProducts(p);
    }

    @DeleteMapping("/product")
    public void deleteProduct(@RequestParam(name = "id") Integer idVal){
        productService.deleteProducts(idVal);
    }

    @PutMapping("/product")
    public String putProduct(@RequestBody Product p){
        return productService.putProducts(p);
    }
}
