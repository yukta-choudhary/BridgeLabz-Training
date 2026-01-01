package com.day1.bankmanagementsystem;
//Customer class holds customer details
public class Customer {

 String name;
 Account account;

 // Constructor
 Customer(String n, Account acc) {
     name = n;
     account = acc;
 }

 // Show customer details
 void showCustomerDetails() {
     System.out.println("Customer Name: " + name);
     account.showBalance();
 }
}
