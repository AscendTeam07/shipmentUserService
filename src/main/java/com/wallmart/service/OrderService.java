package com.wallmart.service;

public interface OrderService {
    void processOrder(int itemId, String customerAddress, String customerMobile, String customerEmail);
}
