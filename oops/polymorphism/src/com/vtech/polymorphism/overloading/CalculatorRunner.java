package com.vtech.polymorphism.overloading;

public class CalculatorRunner {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(5, 10)); //compiler chooses int version
		System.out.println(c.add(2.0, 3.1)); //compiler chooses double version
		System.out.println(c.add(1, 2, 3)); //compiler chooses 3 ints version
	}
}
