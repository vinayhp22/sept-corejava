package com.vtech.encapsulation;

public class LaptopRunner {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.setColor("Black");
		l.setRam(4);
		
		System.out.println(l.getColor());
		System.out.println(l.getRam());
		
		
	}

}

//Slight performance overhead