package com.wallmart.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cart")
public class ShippingCart {

    @Id
    private String id; 
    
    private int shippingId;
    private Long cartId;
    private String typeOfShipping;
    private String destinationOfShipping;
    private double shippingCost;
    private int deliveryDuration;

    public ShippingCart(int shippingId, Long cartId, String typeOfShipping, String destinationOfShipping,
                        double shippingCost, int deliveryDuration) {
        this.shippingId = shippingId;
        this.cartId = cartId;
        this.typeOfShipping = typeOfShipping;
        this.destinationOfShipping = destinationOfShipping;
        this.shippingCost = shippingCost;
        this.deliveryDuration = deliveryDuration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public String getTypeOfShipping() {
        return typeOfShipping;
    }

    public void setTypeOfShipping(String typeOfShipping) {
        this.typeOfShipping = typeOfShipping;
    }

    public String getDestinationOfShipping() {
        return destinationOfShipping;
    }

    public void setDestinationOfShipping(String destinationOfShipping) {
        this.destinationOfShipping = destinationOfShipping;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getDeliveryDuration() {
        return deliveryDuration;
    }

    public void setDeliveryDuration(int deliveryDuration) {
        this.deliveryDuration = deliveryDuration;
    }

    @Override
    public String toString() {
        return "ShippingCart{" +
                "id='" + id + '\'' +
                ", shippingId=" + shippingId +
                ", cartId=" + cartId +
                ", typeOfShipping='" + typeOfShipping + '\'' +
                ", destinationOfShipping='" + destinationOfShipping + '\'' +
                ", shippingCost=" + shippingCost +
                ", deliveryDuration=" + deliveryDuration +
                '}';
    }
}

