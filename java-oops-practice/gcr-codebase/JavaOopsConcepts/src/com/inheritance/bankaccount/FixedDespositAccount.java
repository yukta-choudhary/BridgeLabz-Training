package com.inheritance.bankaccount;
/*
Subclass: FixedDepositAccount
*/

public class FixedDepositAccount extends BankAccount {

    int lockPeriod; // in months

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}