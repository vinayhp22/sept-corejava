package com.vtech.abstraction.interfaceex;

public class CreditCardPayment implements Payment{
	
	public void pay(double amount) {
		System.out.println("Paid INR "+amount+" using Credit Card");
	}

}
