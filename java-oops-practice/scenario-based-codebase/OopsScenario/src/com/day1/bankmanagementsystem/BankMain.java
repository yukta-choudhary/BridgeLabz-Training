package com.day1.bankmanagementsystem;

//Bank class contains main method
public class BankMain {

 public static void main(String[] args) {

     // Create savings account
     SavingsAccount sa = new SavingsAccount(101, 5000, 5);

     // Create customer
     Customer c1 = new Customer("John", sa);

     // Operations
     c1.showCustomerDetails();
     sa.deposit(5000);
     sa.withdraw(1000);
     sa.calculateInterest();
     sa.showBalance();
 }
}
