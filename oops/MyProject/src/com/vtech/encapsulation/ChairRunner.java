package com.vtech.encapsulation;

public class ChairRunner {

	public static void main(String[] args) {
		Chair c = new Chair();
		c.setPrice(-5000);
		System.out.println(c.getPrice()); //0.0
	}
}


//Here, data(price) is hidden and only accessible 
	//through methods that apply rules