package com.vtech.encapsulation;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setBrand("Oneplus");
		m.setPrice(50);
		if(m.getBrand() != null && m.getPrice()!=0.0) {
			System.out.println("Mobile Brand: "+m.getBrand());
			System.out.println("Mobile Price: "+m.getPrice());
		}
	}

}

//Laptop
	//color
	//ram	