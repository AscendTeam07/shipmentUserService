package com.wallmart.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wallmart.entities.ShippingCart;

public interface ShippingCartRepository extends MongoRepository<ShippingCart, String> {
	
    ShippingCart findByCartId(Long cartId);

}
