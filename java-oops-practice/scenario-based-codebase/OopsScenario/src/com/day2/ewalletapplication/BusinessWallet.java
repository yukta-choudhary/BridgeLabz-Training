package com.day2.ewalletapplication;

//BusinessWallet.java
public class BusinessWallet extends Wallet implements Transferrable {

 public BusinessWallet(User user) {
     super(user, 100);   // referral bonus
 }

 @Override
 public void transferTo(User receiver, double amount) {
     double tax = amount * 0.02;   // 2% tax

     if (getBalance() >= amount + tax) {
         updateBalance(-(amount + tax));
         System.out.println("Business transfer of ₹" + amount + " to " + receiver.getName());
     } else {
         System.out.println("Insufficient business balance");
     }
 }
}
