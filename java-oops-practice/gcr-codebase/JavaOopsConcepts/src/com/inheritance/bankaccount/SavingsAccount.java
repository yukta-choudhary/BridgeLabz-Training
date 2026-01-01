package com.inheritance.bankaccount;
/*
Subclass: SavingsAccount
*/

public class SavingsAccount extends BankAccount {

    double interestRate;

    @Override
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}
