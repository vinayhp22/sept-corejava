package com.vtech.abstraction.interfaceex;

public interface Calculator {
	
	default int addition(int x, int y) {
		return add(x, y);
	}
	
	private int add(int x, int y) {
		return x+y;
	}
	
	static void welcome() {
		System.out.println("Welcome to Calculator");
	}
}
