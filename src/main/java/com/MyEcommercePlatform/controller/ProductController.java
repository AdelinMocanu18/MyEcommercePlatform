package com.MyEcommercePlatform.controller;

import com.MyEcommercePlatform.model.Product;
import com.MyEcommercePlatform.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/list")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/list/{productId}")
    public Optional<Product> getProduct(@PathVariable Integer productId) {
        return productService.getProduct(productId);
    }

    @PutMapping("/edit/{productId}")
    public Product updateProduct(@PathVariable Integer productId, @RequestBody Product product) {
        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/delete/{productId}")
    public void deleteProduct(@PathVariable Integer productId) {
        productService.deleteProduct(productId);
    }
}
