package com.functionalinterfaces.digitalpayment;

public class Wallet implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using Wallet!");
	}
}
