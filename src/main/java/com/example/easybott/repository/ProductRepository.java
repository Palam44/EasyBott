package com.example.easybott.repository;

import com.example.easybott.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(String id);
    List<Product> getProductsByType(String type);
    void addProduct(Product product);
    void updateProduct(String id, Product product);
}

