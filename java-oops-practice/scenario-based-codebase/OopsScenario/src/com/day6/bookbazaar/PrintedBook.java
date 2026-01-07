package com.day6.bookbazaar;

//PrintedBook class
public class PrintedBook extends Book {

 // Constructor
 public PrintedBook(String title, String author, double price, int stock) {
     super(title, author, price, stock);
 }

 // Discount for printed book
 public double applyDiscount(int quantity) {
     if (quantity >= 2) {
         return price * quantity * 0.05; // 5% discount
     }
     return 0;
 }
}

