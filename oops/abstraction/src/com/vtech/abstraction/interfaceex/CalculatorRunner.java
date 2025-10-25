package com.vtech.abstraction.interfaceex;

public class CalculatorRunner implements Calculator{
	
	@Override
	public int addition(int x, int y) {
		return Calculator.super.addition(x, y);
	}
	
	public static void main(String[] args) {
		Calculator.welcome();
		CalculatorRunner obj = new CalculatorRunner();
		int sum = obj.addition(10, 20);
		System.out.println("sum: "+sum);
	}
	
}
