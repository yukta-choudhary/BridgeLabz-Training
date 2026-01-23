package com.exceptionhandling;

import java.util.Scanner;

//Custom exception in same file
class InsufficientBalanceException extends Exception {
 InsufficientBalanceException(String msg) {
     super(msg);
 }
}

public class BankAccount {

 double balance = 5000;   // initial balance

 // Withdraw method
 void withdraw(double amount) throws InsufficientBalanceException {
     if (amount < 0)
         throw new IllegalArgumentException("Invalid amount!");

     if (amount > balance)
         throw new InsufficientBalanceException("Insufficient balance!");

     balance = balance - amount;
     System.out.println("Withdrawal successful, new balance: " + balance);
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     BankAccount acc = new BankAccount();

     System.out.print("Enter amount to withdraw: ");
     double amt = sc.nextDouble();

     try {
         acc.withdraw(amt);
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     } catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}
