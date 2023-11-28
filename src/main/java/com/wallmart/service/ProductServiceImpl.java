package com.wallmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wallmart.dao.ProductRepository;
import com.wallmart.entities.Product;

import java.util.List;

import org.bson.types.ObjectId;

@Service
public class ProductServiceImpl implements ProductService {
	private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        // Implement your business logic, if needed
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(int productId, Product product) {
        Product existingProduct = productRepository.findByProductId(productId);

        if (existingProduct != null) {
            // Example: existingProduct.setTitle(product.getTitle());
        	existingProduct.setTitle(product.getTitle());
            return productRepository.save(existingProduct);
        } else {
            throw new ProductNotFoundException("Product not found with ID: " + productId);
        }
    }

    public Product getProduct(int productId) {
        // Implement a custom query to find the product by its integer ID
        return productRepository.findByProductId(productId);
    }
    
    public List<Product> getAllProducts() {
    	//Iterable<Product> products = productRepository.findAll();
        return productRepository.findAll();
    }
    
    public class ProductNotFoundException extends RuntimeException {

        public ProductNotFoundException(String message) {
            super(message);
        }
    }
}



	
