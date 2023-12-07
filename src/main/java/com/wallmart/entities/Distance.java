package com.wallmart.entities;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "distance")
public class Distance {
	@Id
    private String id;
    private String zipcode;
    private String typeOfShipping;
    private double shippingCost;
    private int deliveryDuration;

    public Distance(String zipcode, String typeOfShipping, double shippingCost, int deliveryDuration) {
        this.zipcode = zipcode;
        this.typeOfShipping = typeOfShipping;
        this.shippingCost = shippingCost;
        this.deliveryDuration = deliveryDuration;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTypeOfShipping() {
        return typeOfShipping;
    }

    public void setTypeOfShipping(String typeOfShipping) {
        this.typeOfShipping = typeOfShipping;
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

}

