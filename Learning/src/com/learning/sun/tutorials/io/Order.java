package com.learning.sun.tutorials.io;

import java.io.Serializable;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	private int orderId;
	private double itemPrice;
	private int unitCount;
	private String itemDescription;

	public Order() {

	}

	public Order(int orderId, double itemPrice, int unitCount,
			String itemDescription) {
		this.orderId = orderId;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.unitCount = unitCount;
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getUnitCount() {
		return unitCount;
	}
	public void setUnitCount(int unitCount) {
		this.unitCount = unitCount;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
}
