package com.day6.bookbazaar;

//EBook class
public class EBook extends Book {

 // Constructor
 public EBook(String title, String author, double price, int stock) {
     super(title, author, price, stock);
 }

 // Discount for ebook
 public double applyDiscount(int quantity) {
     return price * quantity * 0.10; // 10% discount
 }
}
