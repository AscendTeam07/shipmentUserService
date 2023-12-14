package com.wallmart.dto;


public class ShipmentResponse {
    private int pid;
    private ShipmentDetails shipment;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public ShipmentDetails getShipment() {
		return shipment;
	}
	public void setShipment(ShipmentDetails shipment) {
		this.shipment = shipment;
	}
    
    

}