package com.vtech.inheritance.bankloanex;

public class BankLoan { //parent / super class
	double loanAmount;
	double interestRate;
	
	public BankLoan(double loanAmount, double interestRate) {
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}
	
	public void displayBankLoan() {
		System.out.println("Loan Amount: "+this.loanAmount);
		System.out.println("Interest Rate: "+this.interestRate);
	}
}
