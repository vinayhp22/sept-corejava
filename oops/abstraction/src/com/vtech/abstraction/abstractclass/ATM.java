package com.vtech.abstraction.abstractclass;

public abstract class ATM {
	//abract method - by default public
	abstract void withdraw();
	abstract void checkbalance();
	
	//concrete method
	public void insertCard() { 
		System.out.println("Card inserted successfully...");
	}
}

//declared using keyword abstract & cannot instantiate

