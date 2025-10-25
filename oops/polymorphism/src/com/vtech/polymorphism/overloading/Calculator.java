package com.vtech.polymorphism.overloading;

public class Calculator {
	int add(int x, int y) {return x+y;}

	double add(double x, double y) {
		return x+y;
	}
	int add(int x, int y, int z){
		return x + y + z;
	}
}
