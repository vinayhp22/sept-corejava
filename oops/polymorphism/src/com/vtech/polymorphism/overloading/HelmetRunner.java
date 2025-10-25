package com.vtech.polymorphism.overloading;

public class HelmetRunner {
	public static void main(String[] args) {
		Helmet ch = new CycleHelmet();
		ch.wear();
		
		Helmet gift = ch.gift();
		gift.wear();
		
	}
}
