package com.day1.bankmanagementsystem;

//SavingsAccount class adds interest feature
public class SavingsAccount extends Account {

 double interestRate;

 // Constructor
 SavingsAccount(int accNo, double bal, double rate) {
     super(accNo, bal);
     interestRate = rate;
 }

 // Calculate interest
 void calculateInterest() {
     double interest = balance * interestRate / 100;
     System.out.println("Interest Amount: " + interest);
 }
}
