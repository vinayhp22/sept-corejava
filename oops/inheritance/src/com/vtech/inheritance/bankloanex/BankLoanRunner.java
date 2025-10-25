package com.vtech.inheritance.bankloanex;

public class BankLoanRunner {

	public static void main(String[] args) {
		HomeLoan homeLoan = new HomeLoan(50000, 12, "BTM 2nd Stage"); // Both Child and parent objects
		homeLoan.displayBankLoan(); // from parent
		homeLoan.displayHomeLoan(); // from child

		BankLoan loan = new HomeLoan(100000, 10, "ChickMangalur"); // Only parent objects because parent reference
		loan.displayBankLoan(); // from parent
		// loan.displayHomeLoan(); //Can't access from child when its reference type is
		// parent

		EducationLoan educationLoan = new EducationLoan(150000, 11, "BE");
		educationLoan.displayBankLoan(); // from parent
		educationLoan.displayEducationLoan(); // from child

		BankLoan loan2 = new EducationLoan(250000, 9, "Mtech");
		loan2.displayBankLoan();
		// loan2.displayEducationLoan(); //Can't access from child when its reference
		// type is parent

	}
}
