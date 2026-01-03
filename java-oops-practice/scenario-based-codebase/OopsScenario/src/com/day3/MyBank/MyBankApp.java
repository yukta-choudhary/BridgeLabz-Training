package com.day3.MyBank;

//Main class
import java.util.Scanner;

public class MyBankApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Account details
     System.out.print("Enter account type (Savings/Current): ");
     String type = sc.nextLine();

     System.out.print("Enter account number: ");
     String accNo = sc.nextLine();

     System.out.print("Enter opening balance: ");
     double balance = sc.nextDouble();

     Account account;

     // Polymorphism
     if (type.equalsIgnoreCase("Savings")) {
         account = new SavingsAccount(accNo, balance);
     } else {
         account = new CurrentAccount(accNo, balance);
     }

     ITransaction txn = (ITransaction) account;

     // Deposit
     System.out.print("Enter deposit amount: ");
     double dep = sc.nextDouble();
     txn.deposit(dep);

     // Withdraw
     System.out.print("Enter withdraw amount: ");
     double wit = sc.nextDouble();
     txn.withdraw(wit);

     // Check balance
     txn.checkBalance();

     // Interest
     System.out.println("Interest: ₹" + account.calculateInterest());

     sc.close();
 }
}
