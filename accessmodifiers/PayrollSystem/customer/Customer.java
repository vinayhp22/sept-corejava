//file: customer/Customer.java
package customer;

class Customer{
	private String password = "my1234"; //private data
	
	private void showPassword(){
		System.out.println("Password: "+ password);
	}
	
	public void login(){
		System.out.println("Login successfull using password");
	}
}