package com.vtech.abstraction.abstractclass;

public class Developer extends Employee {

	public Developer() {
		System.out.println("Developer Constructor Called");
	}
	
	@Override
	void work() {
		System.out.println("Developer writes code.");
	}

}
