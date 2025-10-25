package com.vtech.polymorphism.overriding;

public class AnimalRunner {
	public static void main(String[] args) {
		Child1 c = new Child1();
		Animal d = c.getAnimal();
		//No need to cast to the Dog
		
		//Without covariance
		Animal d1 = (Dog) c.getAnimal();
	}
}
