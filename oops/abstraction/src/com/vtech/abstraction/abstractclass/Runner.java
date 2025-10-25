package com.vtech.abstraction.abstractclass;

public class Runner {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start();
		bike.fuel();
		
		Car car = new Car();
		car.start();
		car.fuel();
		
	}
}
