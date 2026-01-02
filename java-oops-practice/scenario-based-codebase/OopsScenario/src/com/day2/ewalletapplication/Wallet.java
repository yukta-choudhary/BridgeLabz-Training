package com.day2.ewalletapplication;

//Wallet
public class Wallet {
 protected User user;
 private double balance;   // private balance (secure)

 // Normal wallet
 public Wallet(User user) {
     this.user = user;
     this.balance = 0.0;
 }

 // Wallet with referral bonus
 public Wallet(User user, double referralBonus) {
     this.user = user;
     this.balance = referralBonus;
 }

 // Load money
 public void loadMoney(double amount) {
     balance = balance + amount;   // operator +
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Protected method for subclasses
 protected void updateBalance(double amount) {
     balance = balance + amount;
 }
}
