//file: company/Manager.java
package company;

class Manager extends Employee{
	public static void main(String[] args){
		Employee em = new Employee();
		em.showSalary(); //Accessible(same package)
		
		Manager manager = new Manager();
		manager.showSalary(); //Accessible(child class via child reference)
	}
}

