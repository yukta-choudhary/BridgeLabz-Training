package com.objectmodelling.account;

public class BankMain {

	 public static void main(String[] args) {
	
	     // Create bank
	     Bank bank = new Bank("State Bank");
	
	     // Create customers
	     Customer customer1 = new Customer("Rohan");
	     Customer customer2 = new Customer("Amit");
	
	     // Open accounts
	     bank.openAccount(customer1, 101, 5000);
	     bank.openAccount(customer2, 102, 8000);
	
	     // Customers view balance
	     customer1.viewBalance();
	     customer2.viewBalance();
	 }
}
