//file: hr/HrService.java
package hr;

import payroll.TaxCalculator;

class HrService{
	public static void main(String[] args){
		TaxCalculator tc = new TaxCalculator();
		tc.calculateTax();
	}
}
