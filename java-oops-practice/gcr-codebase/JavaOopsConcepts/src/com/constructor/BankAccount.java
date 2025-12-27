package com.constructor;

public class BankAccount {

    // Public variable
    public int accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Parameterized Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass to demonstrate protected access
class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details
    public void displaySavingsDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Balance        : " + getBalance());    // private via getter
    }
}
