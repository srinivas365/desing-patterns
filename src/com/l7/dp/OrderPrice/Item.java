package com.l7.dp.OrderPrice;

public class Item implements Entity {
	private double price;
	public Item(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
}
