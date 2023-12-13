package com.wallmart.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "rules")
public class Rule {
    @Id
    private String id;
    private int rule_id;
    private int distance;
    private int weight;
    private double shipCharges;
    private double sameday;
    private double express;
	public double getSameDay() {
		return sameday;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getRule_id() {
		return rule_id;
	}
	public void setRule_id(int rule_id) {
		this.rule_id = rule_id;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getShipCharges() {
		return shipCharges;
	}
	public void setShipCharges(double shipCharges) {
		this.shipCharges = shipCharges;
	}
	public double getSameday() {
		return sameday;
	}
	public void setSameday(double sameday) {
		this.sameday = sameday;
	}
	public double getExpress() {
		return express;
	}
	public void setExpress(double express) {
		this.express = express;
	}

	
	
}
