package com.vtech.abstraction.interfaceex;

public class PaymentRunner {
	public static void main(String[] args) {
		Payment creditCardPayment = new CreditCardPayment();
		creditCardPayment.pay(1000);
		
		Payment upiPayment = new UpiPayment();
		upiPayment.pay(500);
	}
}
