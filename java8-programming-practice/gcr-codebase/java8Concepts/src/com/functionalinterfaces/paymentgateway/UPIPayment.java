package com.functionalinterfaces.paymentgateway;

public class UPIPayment implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println(amount + "payed using UPI!");
	}
}
