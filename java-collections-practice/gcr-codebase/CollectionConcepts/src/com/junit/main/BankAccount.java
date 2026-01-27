package com.junit.main;
public class BankAccount {

    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
