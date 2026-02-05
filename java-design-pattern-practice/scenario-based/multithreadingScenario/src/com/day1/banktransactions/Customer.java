package com.day1.banktransactions;
// Customer.java
// Represents a bank customer performing transactions

public class Customer extends Thread {
    private Bank bank;
    private int accountNumber;
    private int[] depositAmounts;
    private int[] withdrawAmounts;

    // Constructor to initialize customer
    public Customer(Bank bank, int accountNumber, int[] depositAmounts, int[] withdrawAmounts) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.depositAmounts = depositAmounts;
        this.withdrawAmounts = withdrawAmounts;
    }

    // Run method executes deposit and withdrawal transactions
    public void run() {
        for (int amount : depositAmounts) {
            bank.deposit(accountNumber, amount);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }

        for (int amount : withdrawAmounts) {
            bank.withdraw(accountNumber, amount);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}
