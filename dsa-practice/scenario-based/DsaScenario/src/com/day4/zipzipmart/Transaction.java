package com.day4.zipzipmart;

//Transaction class
public class Transaction {
 String date;     // format: YYYY-MM-DD
 int amount;

 // Constructor
 public Transaction(String date, int amount) {
     this.date = date;
     this.amount = amount;
 }

 // Display transaction
 void display() {
     System.out.println(date + "  Amount: " + amount);
 }
}

