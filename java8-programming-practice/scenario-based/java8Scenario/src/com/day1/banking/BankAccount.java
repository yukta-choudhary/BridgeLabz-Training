package com.day1.banking;

public class BankAccount {

    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accountHolder + " | Balance: " + balance;
    }
}
