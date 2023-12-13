package com.wallmart.service;

import com.wallmart.dto.ShippingCartDTO;

public interface ShippingService {

    ShippingCartDTO calculateShippingCost(Long cartId, int userId);
}
