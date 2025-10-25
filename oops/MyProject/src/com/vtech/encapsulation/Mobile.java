package com.vtech.encapsulation;

public class Mobile {
	
	//1. Data Hiding with private
	private String brand;
	private double price;
	
	//2. Provide public getters & setters
	public void setBrand(String brand) {
		if(!brand.equals("") && brand != null) {
			this.brand=brand;
		} else {
			System.err.println("Invalid Brand Name");
		}
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		} else {
			System.err.println("Invalid Price");
		}
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public double getPrice() {
		return this.price;
	}

}
