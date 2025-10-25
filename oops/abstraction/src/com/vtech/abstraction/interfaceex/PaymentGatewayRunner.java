package com.vtech.abstraction.interfaceex;

public class PaymentGatewayRunner {

	public static void main(String[] args) {
		UpiPaymentGateway upi = new UpiPaymentGateway();
		upi.processPayment(500);
		upi.generateReceipt(500);
		
		CardPayment cardPayment = new CardPayment();
		cardPayment.processPayment(5000);
		cardPayment.generateReceipt(5000);
		System.out.println("Is valid ID? " +
		PaymentGateway.validatePaymentId("PAY1234"));
	}
}
