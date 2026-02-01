package com.functionalinterfaces.digitalpayment;

public class UPI implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using UPI!");
	}
}
