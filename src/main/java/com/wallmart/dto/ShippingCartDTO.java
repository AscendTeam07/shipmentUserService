package com.wallmart.dto;

public class ShippingCartDTO {

    private Integer shippingId;
    private Long cartId;
    private String typeOfShipping;
    private String destinationOfShipping;
    private Double shippingCost;
    private Integer deliveryDuration;
	public Integer getShippingId() {
		return shippingId;
	}
	public void setShippingId(Integer shippingId) {
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
	public Double getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(Double shippingCost) {
		this.shippingCost = shippingCost;
	}
	public Integer getDeliveryDuration() {
		return deliveryDuration;
	}
	public void setDeliveryDuration(Integer deliveryDuration) {
		this.deliveryDuration = deliveryDuration;
	}

}   
