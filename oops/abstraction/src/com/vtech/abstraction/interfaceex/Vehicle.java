package com.vtech.abstraction.interfaceex;

public interface Vehicle {
	//By default: public & abstract
	void start(); //abstract method
	void stop();
	
	//default method - common features
	//By default: public
	default void fuelType(){
		System.out.println("Petrol");
	}
	
	//static method - Utility purpose or helper logic
	//By default: public
	static void engineNo() {
		System.out.println("ABC1234");
	}
	
	//private methods - Java 9 
	private void getName() {
		System.out.println("Printing the name...");
	}
}
