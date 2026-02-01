package com.functionalinterfaces.paymentgateway;

public class PaymentMain {

    public static void main(String[] args) {

        PaymentProcessor upi = new UPIPayment();
        PaymentProcessor card = new CreditCardPayment();

        upi.processPayment(2000);
        upi.refund(500);

        card.processPayment(5000);
        card.refund(1500);
    }
}

