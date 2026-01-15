package com.day10.payxpress;

//Child class for Water Bill
public class WaterBill extends Bill implements IPayable {

 public WaterBill(double amount, String dueDate) {
     super("Water", amount, dueDate);
 }

 public void pay() {
     if (!isPaid()) {
         markPaid();
         System.out.println("Water bill paid successfully.");
     } else {
         System.out.println("Water bill already paid.");
     }
 }

 public void sendReminder() {
     System.out.println("Reminder: Clear your water bill to avoid supply issues.");
 }
}

