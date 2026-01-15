package com.day9.budgetwise;

//Transaction class
public class Transaction {

 private double amount;     // encapsulated
 private String type;
 private String date;
 private String category;

 // Constructor
 public Transaction(double amount, String type, String date, String category) {
     this.amount = amount;
     this.type = type;
     this.date = date;
     this.category = category;
 }

 // Getter for amount
 public double getAmount() {
     return amount;
 }

 // Getter for category
 public String getCategory() {
     return category;
 }
}
