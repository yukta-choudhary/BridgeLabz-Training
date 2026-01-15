package com.day10.payxpress;
//Parent class for all bills
public class Bill {
 protected String type;
 protected double amount;
 protected String dueDate;
 private boolean isPaid;   // encapsulated

 // Constructor for recurring bills
 public Bill(String type, double amount, String dueDate) {
     this.type = type;
     this.amount = amount;
     this.dueDate = dueDate;
     this.isPaid = false;
 }

 // Internal method to mark payment
 protected void markPaid() {
     isPaid = true;
 }

 // Check payment status
 public boolean isPaid() {
     return isPaid;
 }

 // Calculate late fee using operator
 public double calculateLateFee(double penalty) {
     return amount + penalty;
 }
}
