package com.objectmodelling.account;

public class Bank {
	
	 // Bank name
	 private String bankName;
	
	 // Constructor
	 public Bank(String bankName) {
	     this.bankName = bankName;
	 }
	
	 // Open account for customer
	 public void openAccount(Customer customer, int accNo, double balance) {
	     Account account = new Account(accNo, balance);
	     customer.setAccount(account);
	     System.out.println("Account opened for " + bankName);
	 }
}
