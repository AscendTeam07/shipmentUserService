package com.wallmart.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallmart.dao.DistanceRepository;
import com.wallmart.dao.ShippingCartRepository;
import com.wallmart.dao.UserRepository;
import com.wallmart.dto.ShippingCartDTO;
import com.wallmart.entities.Distance;
import com.wallmart.entities.ShippingCart;
import com.wallmart.entities.User;

@Service
public class ShippingServiceImpl implements ShippingService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DistanceRepository distanceRepository;

    @Autowired
    private ShippingCartRepository shippingCartRepository; 
    
    @Override
    public ShippingCartDTO calculateShippingCost(Long cartId, int userId) {
        User user = userRepository.findByUserId(userId);
        Distance distance = distanceRepository.findByZipcode(user.getZipcode());
        
        int generatedShippingId = generateShippingId();

        ShippingCartDTO shippingCartDTO = new ShippingCartDTO();
        shippingCartDTO.setShippingId(generatedShippingId);
        shippingCartDTO.setCartId(cartId);
        shippingCartDTO.setTypeOfShipping(distance.getTypeOfShipping());
        shippingCartDTO.setDestinationOfShipping(user.getAddress());
        shippingCartDTO.setShippingCost(distance.getShippingCost());
        shippingCartDTO.setDeliveryDuration(distance.getDeliveryDuration());

        persistShippingCartData(shippingCartDTO);

        return shippingCartDTO;
    }

    private int generateShippingId() {
        Random random = new Random();
        return random.nextInt(900) + 100;
    }

    private void persistShippingCartData(ShippingCartDTO shippingCartDTO) {
        // Convert ShippingCartDTO to ShippingCart entity and save to MongoDB
        ShippingCart shippingCart = new ShippingCart(
                shippingCartDTO.getShippingId(),
                shippingCartDTO.getCartId(),
                shippingCartDTO.getTypeOfShipping(),
                shippingCartDTO.getDestinationOfShipping(),
                shippingCartDTO.getShippingCost(),
                shippingCartDTO.getDeliveryDuration()
        );
        
        shippingCartRepository.save(shippingCart);
    }
}
