// file: hr/HRService.java
package hr;

import payroll.Manager;

class HRService {
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.show(); // Accessible: because same package
		
		Manager manager = new Manager();
		manager.show(); // Accessible: via child ref because same package
	}
}

