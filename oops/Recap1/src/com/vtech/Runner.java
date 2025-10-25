package com.vtech;

public class Runner {

	public static void main(String[] args) {
		MobileCustomer mc = new MobileCustomer();
		mc.setName("Ajay");
		mc.setMobile(92729792972l);
		mc.setBrand("Iphone");
		
		System.out.println(mc.getName()); //Ajay
		System.out.println(mc.getMobile()); //92729792972
		System.out.println(mc.getBrand()); //Iphone
		
		Customer c = new MobileCustomer();
		c.setName("Vaishak");
		c.setMobile(98827872279l);
		//c.setBrand("Oneplus"); //The method setBrand(String) is undefined for the type Customer
		
		System.out.println(c.getName()); //Vaishak
		System.out.println(c.getMobile()); //98827872279
		//System.out.println(c.getBrand()); //The method getBrand() is undefined for the type Customer

	}
}
