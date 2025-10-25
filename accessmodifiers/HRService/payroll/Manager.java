// file: payroll/Manager.java
package payroll;

import hr.Employee;

public class Manager extends Employee {
	public static void main(String[] args){
		Employee emp = new Employee();
		//emp.show(); // Not-Accessible: via parent ref in other package
		//emp.name = "Sudeep";  // Not-Accessible: via parent ref in other package
		
		Manager manager = new Manager();
		manager.show(); //Accessible: via child ref in other package also
		manager.name = "Yash";
		manager.salary = 100000;
		manager.show();
	}
}