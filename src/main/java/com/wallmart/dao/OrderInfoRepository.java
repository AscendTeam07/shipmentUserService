package com.wallmart.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wallmart.entities.OrderInfo;

public interface OrderInfoRepository extends MongoRepository<OrderInfo,String>{
    OrderInfo findByOrderId(Integer orderId);

}
