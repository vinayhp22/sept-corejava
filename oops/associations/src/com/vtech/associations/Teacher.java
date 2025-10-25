package com.vtech.associations;

public class Teacher {
	String name;
	public Teacher(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Student s = new Student("Guru");
		Teacher t = new Teacher("Shisya");
		System.out.println(t.name + " teaches "+ s.name);

	}
}
