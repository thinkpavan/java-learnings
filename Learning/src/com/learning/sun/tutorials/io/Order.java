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
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemPrice=" + itemPrice
				+ ", unitCount=" + unitCount + ", itemDescription="
				+ itemDescription + "]";
	}

	public static class OrderBuilder{
		private int nestedOrderId;
		private double nestedItemPrice;
		private int nestedUnitCount;
		private String nestedItemDescription;
		
		public OrderBuilder setOrderId(int nestedOrderId){
			this.nestedOrderId = nestedOrderId;
			return this;
		}
		public OrderBuilder setItemPrice(int nestedItemPrice){
			this.nestedItemPrice = nestedItemPrice;
			return this;
		}
		public OrderBuilder setUnitCount(int nestedUnitCount){
			this.nestedUnitCount = nestedUnitCount;
			return this;
		}
		public OrderBuilder setItemDescription(String nestedItemDescription){
			this.nestedItemDescription = nestedItemDescription;
			return this;
		}
		
		public Order createOrder(){
			return new Order(nestedOrderId,nestedItemPrice,nestedUnitCount,nestedItemDescription);
		}
	}
}
