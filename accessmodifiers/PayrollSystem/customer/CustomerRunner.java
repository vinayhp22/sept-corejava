//file: customer/CustomerApp.java
package customer;

class CustomerApp{
	public static void main(String[] args){
		Customer customer = new Customer();
		// customer.showPassword(); //C.E: showPassword() has private access in Customer
		customer.login();
	}
}