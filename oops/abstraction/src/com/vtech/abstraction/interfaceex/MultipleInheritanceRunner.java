package com.vtech.abstraction.interfaceex;

public class MultipleInheritanceRunner implements Printable, Showable {

	@Override
	public void print() {
		System.out.println("Printing...");
	}
	
	@Override
	public void show() {
		System.out.println("Showing...");		
	}
	
	public static void main(String[] args) {
		MultipleInheritanceRunner obj = new MultipleInheritanceRunner();
		obj.print();
		obj.show();
	}
}
