package com.vtech.inheritance.bankloanex;

public class HomeLoan extends BankLoan{ //child/sub - class
	// HomeLoan IS-A BankLoan
	String siteLocation;
	
	public HomeLoan(double loanAmount, double interestRate, String siteLocation) {
		super(loanAmount, interestRate);
		this.siteLocation = siteLocation;
	}
	
	public void displayHomeLoan() {
		System.out.println("Site Location: "+this.siteLocation);
	}
}
