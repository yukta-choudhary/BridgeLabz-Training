package com.objectmodelling.account;

public class AccountCustomer {
	
	 // Attributes
	 private String name;
	 private Account account;
	
	 // Constructor
	 public Customer(String name) {
	     this.name = name;
	 }
	
	 // Set account for customer
	 public void setAccount(Account account) {
	     this.account = account;
	 }
	
	 // View account balance
	 public void viewBalance() {
	     if (account != null) {
	         System.out.println(name + "'s balance: " + account.getBalance());
	     } else {
	         System.out.println(name + " has no account");
	     }
	 }
}
