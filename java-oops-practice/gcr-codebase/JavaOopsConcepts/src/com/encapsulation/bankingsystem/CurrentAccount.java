package com.encapsulation.bankingsystem;

//Current account class
public class CurrentAccount extends BankAccount implements Loanable {

 public CurrentAccount(int accNo, String name, double balance) {
     super(accNo, name, balance);
 }

 // 2% interest
 @Override
 public double calculateInterest() {
     return getBalance() * 0.02;
 }

 @Override
 public void applyForLoan() {
     System.out.println("Loan applied for Current Account");
 }

 @Override
 public double calculateLoanEligibility() {
     return getBalance() * 3;
 }
}
