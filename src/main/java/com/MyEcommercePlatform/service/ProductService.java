package com.MyEcommercePlatform.service;

import com.MyEcommercePlatform.model.Product;
import com.MyEcommercePlatform.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProduct(Integer productId) {
        return productRepository.findById(productId);
    }

    public Product updateProduct(Integer productId, Product product) {
    	product.setId(productId);
    	return productRepository.save(product);
    }

    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
    }
}

