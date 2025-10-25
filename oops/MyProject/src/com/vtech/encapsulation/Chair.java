package com.vtech.encapsulation;

public class Chair {

	private double price; 
	
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
	}
	public double getPrice() {
		return this.price;
	}

}
