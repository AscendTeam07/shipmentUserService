package com.wallmart.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.wallmart.entities.Distance;

public interface DistanceRepository extends MongoRepository<Distance, String> {

    Distance findByZipcode(String zipcode);
      
}
