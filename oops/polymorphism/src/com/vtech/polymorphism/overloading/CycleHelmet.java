package com.vtech.polymorphism.overloading;

public class CycleHelmet extends Helmet{
	
	@Override
	public void wear() {
		System.out.println("Weared Cycle Helmet");
	}
	
	@Override
	public String wear(String something) {
		return something;
	}
	
	@Override
	public String wear(String brand, double price) {
		return brand + price;
	}
	
	@Override
	public CycleHelmet gift() {
		return new CycleHelmet();
	}
	//Covarient return type
	//CycleHelmet IS-A Helmet
}


