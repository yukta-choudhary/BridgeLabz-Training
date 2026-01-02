package com.day2.ewalletapplication;

//EWalletMain
public class EWalletMain {
 public static void main(String[] args) {

     User u1 = new User(1, "Aakash");
     User u2 = new User(2, "Riya");

     PersonalWallet pw = new PersonalWallet(u1);
     BusinessWallet bw = new BusinessWallet(u2);

     pw.loadMoney(1000);
     bw.loadMoney(2000);

     pw.transferTo(u2, 300);
     bw.transferTo(u1, 500);

     System.out.println("Aakash Balance: " + pw.getBalance());
     System.out.println("Riya Balance: " + bw.getBalance());
 }
}
