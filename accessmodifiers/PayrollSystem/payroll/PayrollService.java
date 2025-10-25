//file: payroll/PayrollService.java
package payroll;

class PayrollService{
	public static void main(String[] args){
		TaxCalculator tc = new TaxCalculator();
		tc.calculateTax();

	}
}

//Execution
//javac payroll/TaxCalculator.java payroll/PayrollService.java hr/HrService.java

//java payroll.PayrollService

//java hr.HrService