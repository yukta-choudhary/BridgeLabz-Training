package com.functionalinterfaces.digitalpayment;

public class DigiPay {

	public static void main(String[] args) {
		
		IPayment p1 = new UPI();
		IPayment p2 = new Wallet();
		IPayment p3 = new CreditCard();
		
		p1.pay(2000);
		p2.pay(5000);
		p3.pay(7000);
	}
}
