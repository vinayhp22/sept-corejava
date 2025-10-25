package com.vtech.inheritance.bankloanex;

public class GoldLoan extends BankLoan {

	int qualityOfGold;
	
	public GoldLoan(double loanAmount, double interestRate, int qualityOfGold) {
		super(loanAmount, interestRate);
		this.qualityOfGold = qualityOfGold;
	}
	
	public void displayGoldLoan() {
		System.out.println("Gold Loan - quality of Gold: "+ this.qualityOfGold);
	}

}
