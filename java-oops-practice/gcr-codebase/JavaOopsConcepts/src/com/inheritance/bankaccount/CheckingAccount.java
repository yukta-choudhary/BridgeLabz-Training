package com.inheritance.bankaccount;

/*
Subclass: CheckingAccount
*/

public class CheckingAccount extends BankAccount {

    int withdrawalLimit;

    @Override
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}