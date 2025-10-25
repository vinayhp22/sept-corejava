package com.vtech.abstraction.abstractclass;

public class HDFCBank extends Bank {
	
	@Override
	void rateOfInterest() {
		System.out.println("HDFC Rate of Interest: 7.5%");		
	}
	
	@Override
	void welcome() {
		System.out.println("Welcome to HDFC Bank!!!");
	}
}
