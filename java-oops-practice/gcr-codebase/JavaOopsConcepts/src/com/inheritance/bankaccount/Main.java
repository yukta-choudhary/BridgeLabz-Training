package com.inheritance.bankaccount;

import java.util.Scanner;

/*
Main class to test hierarchical inheritance
*/

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Savings Account
        SavingsAccount sa = new SavingsAccount();
        System.out.print("Enter Savings Account Number: ");
        sa.accountNumber = input.nextInt();
        System.out.print("Enter Balance: ");
        sa.balance = input.nextDouble();
        System.out.print("Enter Interest Rate: ");
        sa.interestRate = input.nextDouble();

        sa.displayAccountType();
        System.out.println("Balance: " + sa.balance);
        System.out.println("Interest Rate: " + sa.interestRate);

        // Checking Account
        CheckingAccount ca = new CheckingAccount();
        System.out.print("\nEnter Checking Account Withdrawal Limit: ");
        ca.withdrawalLimit = input.nextInt();

        ca.displayAccountType();
        System.out.println("Withdrawal Limit: " + ca.withdrawalLimit);

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        System.out.print("\nEnter FD Lock Period (months): ");
        fd.lockPeriod = input.nextInt();

        fd.displayAccountType();
        System.out.println("Lock Period: " + fd.lockPeriod + " months");
    }
}
