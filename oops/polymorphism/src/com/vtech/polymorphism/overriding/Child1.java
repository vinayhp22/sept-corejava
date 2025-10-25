package com.vtech.polymorphism.overriding;

public class Child1 extends Parent1 {
	@Override
	Dog getAnimal() {
		return new Dog();
	}
}
