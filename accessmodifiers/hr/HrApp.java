//file: hr/HrApp.java
package hr;

import company.Employee;

public class HrApp extends Employee{
	public static void main(String[] args){
		
		
		HrApp hr = new HrApp();
		hr.showSalary(); //Accessible(via child reference)
	
		
		Employee em = new Employee();
		//em.showSalary(); //Not accessible(Outside package via parent reference)
	}
}