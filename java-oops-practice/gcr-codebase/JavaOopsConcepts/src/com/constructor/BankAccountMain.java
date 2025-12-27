package com.constructor;

public class BankAccountMain {

    public static void main(String[] args) {

        // Create SavingsAccount object
        SavingsAccount sa = new SavingsAccount(1001, "Yukta", 25000);

        // Display account details
        sa.displaySavingsDetails();

        System.out.println();

        // Modify balance using public setter
        sa.setBalance(30000);

        // Display updated details
        System.out.println("After Balance Update:");
        sa.displaySavingsDetails();
    }
}
