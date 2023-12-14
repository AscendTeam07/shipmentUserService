package com.wallmart.dto;


public class ShipmentDetails {
    private ShipmentOption samedayDelivery;
    private ShipmentOption expressDelivery;
    private ShipmentOption standardDelivery;
	public ShipmentOption getSamedayDelivery() {
		return samedayDelivery;
	}
	public void setSamedayDelivery(ShipmentOption samedayDelivery) {
		this.samedayDelivery = samedayDelivery;
	}
	public ShipmentOption getExpressDelivery() {
		return expressDelivery;
	}
	public void setExpressDelivery(ShipmentOption expressDelivery) {
		this.expressDelivery = expressDelivery;
	}
	public ShipmentOption getStandardDelivery() {
		return standardDelivery;
	}
	public void setStandardDelivery(ShipmentOption standardDelivery) {
		this.standardDelivery = standardDelivery;
	}
    
    

}
