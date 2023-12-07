package com.wallmart.dto;

public class CartRequestDTO {
	
	private Long cartId;
    private Long userId;

    public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
