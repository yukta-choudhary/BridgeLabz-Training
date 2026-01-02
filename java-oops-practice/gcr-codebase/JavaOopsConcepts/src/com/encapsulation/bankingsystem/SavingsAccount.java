package com.encapsulation.bankingsystem;

//Savings account class
public class SavingsAccount extends BankAccount implements Loanable {

 public SavingsAccount(int accNo, String name, double balance) {
     super(accNo, name, balance);
 }

 // 4% interest
 @Override
 public double calculateInterest() {
     return getBalance() * 0.04;
 }

 @Override
 public void applyForLoan() {
     System.out.println("Loan applied for Savings Account");
 }

 @Override
 public double calculateLoanEligibility() {
     return getBalance() * 2;
 }
}
