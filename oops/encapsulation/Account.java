class Account{
	//Step1: Data Hiding with private
	private double balance; 
	
	//Step2:  Provide public setters & getters
	public void setBalance(double balance){
		if(balance>0){
			this.balance = balance;
		} else {
			System.out.println("Invalid balance updating!!!(Negative balance)")
		}
	}
	
	public double getBalance(){
		return this.balance;
	}
}

//Encapsulation = Data Hiding + Abstraction
//Encapsulation is the process of binding data(variables) and
//methods(functions) into single unit(i.e called a class)

task:
	Add another variable - accountNumber
	give behaviours - withdraw(), deposit()