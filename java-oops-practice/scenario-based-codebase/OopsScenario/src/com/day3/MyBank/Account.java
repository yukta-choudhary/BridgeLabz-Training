package com.day3.MyBank;

//Base class Account
public class Account {

 protected String accountNumber;
 private double balance;   // encapsulated data

 // Constructor with opening balance
 Account(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Constructor without opening balance
 Account(String accountNumber) {
     this.accountNumber = accountNumber;
     this.balance = 0;
 }

 // Get balance
 double getBalance() {
     return balance;
 }

 // Set balance
 void setBalance(double balance) {
     this.balance = balance;
 }

 // Method to be overridden
 double calculateInterest() {
     return 0;
 }
}
