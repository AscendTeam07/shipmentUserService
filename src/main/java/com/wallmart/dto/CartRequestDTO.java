package com.wallmart.dto;

public class CartRequestDTO {
	
	private Long cartId;
    private int userId;

    public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
