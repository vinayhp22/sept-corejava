package com.vtech;

public class Mobile {
	//Variables
	private String name;
	private String brand;
	private double price;
	
	//Constructors
	public Mobile() {
		System.out.println("Mobile object created...");
	}
	public Mobile(String name) {
		this();
		this.name = name;
	}

	public Mobile(String name, String brand) {
		this(name);
		this.brand = brand;
	}
	public Mobile(String name, String brand, double price) {
		this(name, brand);
		this.price = price;
	}
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayMobile() {
		System.out.println("Name: "+this.getName());
		System.out.println("Brand: "+this.getBrand());
		System.out.println("Price: "+this.getPrice());
	}
	
}
