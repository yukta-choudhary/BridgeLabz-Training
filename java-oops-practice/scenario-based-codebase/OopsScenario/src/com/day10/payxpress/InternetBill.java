package com.day10.payxpress;
//Child class for Internet Bill
public class InternetBill extends Bill implements IPayable {

 public InternetBill(double amount, String dueDate) {
     super("Internet", amount, dueDate);
 }

 public void pay() {
     if (!isPaid()) {
         markPaid();
         System.out.println("Internet bill paid successfully.");
     } else {
         System.out.println("Internet bill already paid.");
     }
 }

 public void sendReminder() {
     System.out.println("Reminder: Pay internet bill to avoid disconnection.");
 }
}
