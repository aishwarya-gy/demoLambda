package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return this.productRepository.save(product);
    }

    public Optional<Product> getProduct(Long productId){
        return this.productRepository.findById(productId);
    }

    public Iterable<Product> getAllProducts(){
        return this.productRepository.findAll();
    }
}
