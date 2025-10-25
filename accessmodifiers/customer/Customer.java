//file: customer/Customer.java
package customer;

import bank.BankService; //fully qualified name
// packageName.ClassName;
import branch.BranchDetails;

class Customer{
	public static void main(String[] args){
		BankService hsbc = new BankService();
		hsbc.openAccount(); //Accessible from another package
		BranchDetails branch = new BranchDetails();
		branch.showDetails();
	}
}

//Execution:
//<base-folder>javac bank/BankService.java customer/Customer.java

//<base-folder>java customer.Customer

//Note:
//If bank.BankService is not public => C.E: BankService is not public in bank; cannot be accessed from outside package
//If bank.BankService.openAccount() is not public => C.E:openAccount() is not public in BankService; cannot be accessed from outside package