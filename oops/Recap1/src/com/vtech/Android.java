package com.vtech;

public class Android extends Mobile{
	//variables
	private double androidVersion;

	//constructors
	public Android() {
		System.out.println("Androd is created..");
	}

	public Android(String name) {
		super(name);
	}
	public Android(String name, String brand) {
		super(name, brand);
	}
	public Android(String name, String brand, double price) {
		super(name, brand, price);
	}
	public Android(String name, String brand, double price, double androidVersion) {
		super(name, brand, price);
		this.androidVersion = androidVersion;
	}
	
	//methods
	public double getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(double androidVersion) {
		this.androidVersion = androidVersion;
	}
	
	public void displayAndroid() {
		super.displayMobile();
		System.out.println("Android Version: "+this.getAndroidVersion());
	}
	
}
