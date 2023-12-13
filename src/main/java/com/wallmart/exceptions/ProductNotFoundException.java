package com.wallmart.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(int itemId) {
        super("Product not found with ID: " + itemId);
    }
}
