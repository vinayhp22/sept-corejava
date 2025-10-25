package com.vtech.associations.aggregation;

public class Human {
	private Heart heart;
	
	public Human() {
		heart = new Heart();
	}
	
	public void startPump() {
		heart.pump();
	}
}
