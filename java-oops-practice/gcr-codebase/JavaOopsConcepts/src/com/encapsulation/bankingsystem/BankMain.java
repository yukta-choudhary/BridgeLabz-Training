package com.encapsulation.bankingsystem;

//Main class to demonstrate polymorphism
public class BankMain {

 public static void main(String[] args) {

     // Polymorphism using BankAccount reference
     BankAccount acc1 = new SavingsAccount(101, "Riya", 50000);
     BankAccount acc2 = new CurrentAccount(102, "Arjun", 80000);

     BankAccount[] accounts = { acc1, acc2 };

     for (BankAccount acc : accounts) {

         double interest = acc.calculateInterest();

         System.out.println("Account Holder: " + acc.getHolderName());
         System.out.println("Balance: " + acc.getBalance());
         System.out.println("Interest: " + interest);

         // Loan processing
         if (acc instanceof Loanable) {
             ((Loanable) acc).applyForLoan();
             System.out.println("Loan Eligibility: " +
                     ((Loanable) acc).calculateLoanEligibility());
         }

         System.out.println("----------------------");
     }
 }
}
