package com.multithreading.bankingsystem;
/*
Problem 2: Banking System
Shared resource class
*/

public class BankAccount {

    private int balance = 10000;

    public void withdraw(String customer, int amount) {

        System.out.println("[" + customer + "] Attempting to withdraw " + amount);

        if (balance >= amount) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println("Transaction successful: " + customer +
                    ", Amount: " + amount +
                    ", Balance: " + balance);
        } else {
            System.out.println("Transaction failed for " + customer +
                    " - Insufficient balance");
        }
    }
}
