package com.vtech.polymorphism.overriding;

public class SBI extends Bank {
	@Override
	double getRateOfInterest() {
		return 6.5;
	}
}