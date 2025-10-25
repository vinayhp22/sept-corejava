package com.vtech.inheritance.bankloanex;

public class EducationLoan extends BankLoan {
	
	String courseName;
	
	public EducationLoan(double loanAmount, double interestRate, String courseName) {
		super(loanAmount, interestRate);
		this.courseName = courseName;
	}
	
	public void displayEducationLoan() {
		System.out.println("Education loan - course Name: "+this.courseName);
	}

}
