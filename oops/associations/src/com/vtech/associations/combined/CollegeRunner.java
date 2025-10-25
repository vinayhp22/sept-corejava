package com.vtech.associations.combined;

public class CollegeRunner {
	public static void main(String[] args) {
		Department department = new Department("CSE");
		College college = new College("Vtech", "Ajay", department);
		college.display();
	}
}
