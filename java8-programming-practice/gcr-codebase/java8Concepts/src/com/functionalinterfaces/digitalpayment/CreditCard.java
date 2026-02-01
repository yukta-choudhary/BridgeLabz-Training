package com.functionalinterfaces.digitalpayment;

public class CreditCard implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using Credit Card!");
	}
}
