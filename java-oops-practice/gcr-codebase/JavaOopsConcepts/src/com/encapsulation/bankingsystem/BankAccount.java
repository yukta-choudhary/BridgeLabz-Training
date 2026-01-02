package com.encapsulation.bankingsystem;

//Abstract class BankAccount
public abstract class BankAccount {

 // Encapsulated fields
 private int accountNumber;
 private String holderName;
 private double balance;

 // Constructor
 public BankAccount(int accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 // Getters
 public int getAccountNumber() {
     return accountNumber;
 }

 public String getHolderName() {
     return holderName;
 }

 public double getBalance() {
     return balance;
 }

 // Deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance = balance + amount;
     }
 }

 // Withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance = balance - amount;
     }
 }

 // Abstract method
 public abstract double calculateInterest();
}
