package com.day1.bankmanagementsystem;

//Account class handles common account operations
public class Account {

 int accountNo;
 double balance;

 // Constructor
 Account(int accNo, double bal) {
     accountNo = accNo;
     balance = bal;
 }

 // Deposit money
 void deposit(double amount) {
     balance = balance + amount;
     System.out.println("Amount deposited: " + amount);
 }

 // Withdraw money
 void withdraw(double amount) {
     if (amount <= balance) {
         balance = balance - amount;
         System.out.println("Amount withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance");
     }
 }

 // Show balance
 void showBalance() {
     System.out.println("Current Balance: " + balance);
 }
}
