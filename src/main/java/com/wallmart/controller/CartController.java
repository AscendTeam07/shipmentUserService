package com.wallmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallmart.dto.CartRequestDTO;
import com.wallmart.dto.ShippingCartDTO;
import com.wallmart.service.ShippingService;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private ShippingService shippingService;

    @PostMapping("/calculateShipping")
    public ResponseEntity<ShippingCartDTO> calculateShippingCost(@RequestBody CartRequestDTO cartRequestDTO) {
        ShippingCartDTO shippingCartDTO = shippingService.calculateShippingCost(cartRequestDTO.getCartId(), cartRequestDTO.getUserId());
        return new ResponseEntity<>(shippingCartDTO, HttpStatus.OK);
    }
} 