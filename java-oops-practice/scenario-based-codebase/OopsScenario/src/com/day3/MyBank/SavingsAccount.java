package com.day3.MyBank;

//SavingsAccount class
public class SavingsAccount extends Account implements ITransaction {

 private double interestRate = 4.0;

 SavingsAccount(String accNo, double balance) {
     super(accNo, balance);
 }

 // Deposit money
 public void deposit(double amount) {
     setBalance(getBalance() + amount);
 }

 // Withdraw money
 public void withdraw(double amount) {
     setBalance(getBalance() - amount);
 }

 // Check balance
 public void checkBalance() {
     System.out.println("Balance: ₹" + getBalance());
 }

 // Calculate interest
 double calculateInterest() {
     return getBalance() * interestRate / 100; // operator usage
 }
}
