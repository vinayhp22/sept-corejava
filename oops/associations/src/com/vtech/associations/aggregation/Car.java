package com.vtech.associations.aggregation;

public class Car {
	
	private Driver driver;
	
	public Car(Driver driver) { //aggregation with default access modifier for variable
		this.driver = driver;
	}
	
	public Car(String name) { //composition with private access modifier for variable
		driver = new Driver(name);
	}
}

