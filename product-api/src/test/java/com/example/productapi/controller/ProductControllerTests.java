package com.example.productapi.controller;

import com.example.productapi.model.Product;
import com.example.productapi.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;

public class ProductControllerTests {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    public ProductControllerTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllProducts() {
        Product product = new Product("Product 1", 10.0);
        when(productService.getAllProducts()).thenReturn(Collections.singletonList(product));

        List<Product> products = productController.getAllProducts();

        assertEquals(1, products.size());
        assertEquals("Product 1", products.get(0).getName());
    }

    @Test
    void testAddProduct_Success() {
        Product product = new Product("Product 1", 10.0);
        when(productService.addProduct(any(Product.class))).thenReturn(product);

        ResponseEntity<Product> response = productController.addProduct(product);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(product, response.getBody());
    }

    @Test
    void testAddProduct_Failure() {
        Product product = new Product("Product 1", -10.0);

        ResponseEntity<Product> response = productController.addProduct(product);

        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    }
}
