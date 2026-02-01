package com.functionalinterfaces.paymentgateway;

public class CreditCardPayment implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		System.out.println(amount + " payed using Credit Card");
	}
	
	@Override
	public void refund(double amount) {
		System.out.println(amount + " redund initiated via credit card!");
	}
}
