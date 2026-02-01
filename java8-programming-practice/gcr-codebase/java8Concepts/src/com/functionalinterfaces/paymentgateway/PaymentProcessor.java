package com.functionalinterfaces.paymentgateway;

public interface PaymentProcessor {

	public void processPayment(double amount);
	
	default void refund(double amount) {
		System.out.println(amount + " refund initiated!");
	}
}
