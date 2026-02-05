package com.day1.banktransactions;
// Main.java
// Driver program to simulate multiple customers interacting with the bank concurrently

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(3, 1000); // 3 accounts with initial balance 1000

        // Create customers with deposit and withdrawal sequences
        Customer customer1 = new Customer(bank, 0, new int[]{200, 100}, new int[]{150, 50});
        Customer customer2 = new Customer(bank, 1, new int[]{300, 200}, new int[]{100, 400});
        Customer customer3 = new Customer(bank, 2, new int[]{500}, new int[]{200, 100});

        // Start customer threads
        customer1.start();
        customer2.start();
        customer3.start();

        // Wait for all threads to finish
        try {
            customer1.join();
            customer2.join();
            customer3.join();
        } catch (InterruptedException e) {}

        // Print final balances
        System.out.println("\nFinal Balances:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Account " + i + ": " + bank.getBalance(i));
        }
    }
}
