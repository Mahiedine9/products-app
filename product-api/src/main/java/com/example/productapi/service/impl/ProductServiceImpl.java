package com.example.productapi.service.impl;

import com.example.productapi.model.Product;
import com.example.productapi.service.ProductService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        productList.sort(Comparator.comparing(Product::getName));
        return productList;
    }

    @Override
    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }
}
