package com.day2.ewalletapplication;

//PersonalWallet
public class PersonalWallet extends Wallet implements Transferrable {

 public PersonalWallet(User user) {
     super(user);
 }

 @Override
 public void transferTo(User receiver, double amount) {
     double tax = 10;   // fixed transfer charge

     if (getBalance() >= amount + tax) {
         updateBalance(-(amount + tax));   // deduction
         System.out.println("Transferred ₹" + amount + " to " + receiver.getName());
     } else {
         System.out.println("Insufficient balance");
     }
 }
}

