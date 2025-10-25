package com.vtech.abstraction.interfaceex;

public interface PaymentGateway {

	void processPayment(double amount);
	
	//defaut method
	default void generateReceipt(double amount) {
		log("Generating Receipt....");
		System.out.println("Thanks for shoping with us, total amount is: "+amount);
	}
	
	//static method
	static boolean validatePaymentId(String id) {
		log("Validating Payment ID...");
		return id!=null && id.startsWith("PAY") && id.length()>5;
	}
	
	//Private helper method
	private static void log(String msg) {
		System.out.println("[Payment log]"+msg);
	}
}
