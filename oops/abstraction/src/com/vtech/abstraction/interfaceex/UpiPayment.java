package com.vtech.abstraction.interfaceex;

public class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid INR "+amount+" using UPI");
	}
}
