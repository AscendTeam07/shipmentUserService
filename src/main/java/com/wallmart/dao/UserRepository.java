package com.wallmart.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.wallmart.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
    
    User findByUserId(Integer userId);
        
}


