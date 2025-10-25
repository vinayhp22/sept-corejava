package com.vtech.polymorphism.overriding;

public class BankRunner {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		System.out.println("SBI Rate: "+sbi.getRateOfInterest());
		System.out.println("HDFC Rate: "+hdfc.getRateOfInterest());
		
	}
}
