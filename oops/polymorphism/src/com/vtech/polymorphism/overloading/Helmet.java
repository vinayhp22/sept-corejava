package com.vtech.polymorphism.overloading;

public class Helmet {
	String brand;
	double price;
	
	public void wear() {
		System.out.println("Weared Helmet");
	}
	
	public String wear(String brand) {
		System.out.println("Weared "+brand+"'s Helmet");
		return "Weared "+brand+"'s Helmet";
	}
	
	public String wear(String brand, double price) {
		System.out.println("Weared "+brand+"'s Helmet and price is INR "+price);
		return "Weared "+brand+"'s Helmet and price is INR "+price;
	}
	
	public Helmet gift() {
		return new Helmet();
	}
}
