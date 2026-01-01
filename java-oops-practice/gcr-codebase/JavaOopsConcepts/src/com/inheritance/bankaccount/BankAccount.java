package com.inheritance.bankaccount;

/*
Superclass: BankAccount
Stores common account details
*/

public class BankAccount {

    int accountNumber;
    double balance;

    // Method to be overridden
    void displayAccountType() {
        System.out.println("Bank Account");
    }
}
