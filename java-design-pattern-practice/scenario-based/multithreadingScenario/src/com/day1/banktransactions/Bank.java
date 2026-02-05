package com.day1.banktransactions;
// Bank.java
// Handles accounts and thread-safe transactions

public class Bank {
    private int[] balances; // Array to store account balances

    // Constructor to initialize bank accounts
    public Bank(int numberOfAccounts, int initialBalance) {
        balances = new int[numberOfAccounts];
        for (int i = 0; i < numberOfAccounts; i++) {
            balances[i] = initialBalance;
        }
    }

    // Deposit money into an account (synchronized for thread safety)
    public synchronized void deposit(int accountNumber, int amount) {
        int oldBalance = balances[accountNumber];
        balances[accountNumber] += amount;
        System.out.println("Account " + accountNumber + " deposited " + amount +
                           ". Old Balance: " + oldBalance + ", New Balance: " + balances[accountNumber]);
    }

    // Withdraw money from an account (synchronized for thread safety)
    public synchronized void withdraw(int accountNumber, int amount) {
        if (balances[accountNumber] >= amount) {
            int oldBalance = balances[accountNumber];
            balances[accountNumber] -= amount;
            System.out.println("Account " + accountNumber + " withdrew " + amount +
                               ". Old Balance: " + oldBalance + ", New Balance: " + balances[accountNumber]);
        } else {
            System.out.println("Account " + accountNumber + " insufficient funds for withdrawal of " + amount +
                               ". Current Balance: " + balances[accountNumber]);
        }
    }

    // Get current balance of an account
    public synchronized int getBalance(int accountNumber) {
        return balances[accountNumber];
    }
}
