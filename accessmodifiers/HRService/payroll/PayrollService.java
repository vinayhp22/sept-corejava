// file: payroll/PayrollService.java
package payroll;

import hr.Employee;

class PayrollService {
	public static void main(String[] args){
		Employee emp = new Employee();
		// emp.show(); // Not-Accessible: because of other package
		
		Manager manager = new Manager();
		manager.show(); // Not-Accessible: even child ref also in other package
	}
}

