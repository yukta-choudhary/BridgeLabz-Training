package com.objectmodelling.account;


public class Account {
	
	 // Attributes
	 private int accountNumber;
	 private double balance;
	
	 // Constructor
	 public Account(int accountNumber, double balance) {
	     this.accountNumber = accountNumber;
	     this.balance = balance;
	 }
	
	 // Get balance
	 public double getBalance() {
	     return balance;
	 }
}
