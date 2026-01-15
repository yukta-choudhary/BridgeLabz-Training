package com.day10.payxpress;

//Child class for Electricity Bill
public class ElectricityBill extends Bill implements IPayable {

 public ElectricityBill(double amount, String dueDate) {
     super("Electricity", amount, dueDate);
 }

 // Pay bill
 public void pay() {
     if (!isPaid()) {
         markPaid();
         System.out.println("Electricity bill paid successfully.");
     } else {
         System.out.println("Electricity bill already paid.");
     }
 }

 // Polymorphic reminder
 public void sendReminder() {
     System.out.println("Reminder: Pay your electricity bill before power cut!");
 }
}
