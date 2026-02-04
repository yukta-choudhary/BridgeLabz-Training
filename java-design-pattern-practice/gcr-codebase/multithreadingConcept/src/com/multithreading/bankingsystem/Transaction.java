package com.multithreading.bankingsystem;
/*
Problem 2: Banking System
Transaction class using Runnable
*/

public class Transaction implements Runnable {

    private BankAccount account;
    private int amount;
    private String customerName;

    public Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println(customerName + " Thread State: " +
                Thread.currentThread().getState());
        account.withdraw(customerName, amount);
    }
}
