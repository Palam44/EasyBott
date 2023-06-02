package com.example.easybott.repository;

import com.example.easybott.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private Map<String, Product> products;

    public InMemoryProductRepository() {
        products = new HashMap<>();
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product getProductById(String id) {
        return products.get(id);
    }

    @Override
    public List<Product> getProductsByType(String type) {
        return products.values().stream()
                .filter(product -> type.equalsIgnoreCase(product.getType()))
                .collect(Collectors.toList());
    }

    @Override
    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void updateProduct(String id, Product product) {
        if (products.containsKey(id)) {
            products.put(id, product);
        }
    }
}

