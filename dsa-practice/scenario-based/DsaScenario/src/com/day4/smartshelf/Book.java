package com.day4.smartshelf;

//Book class
public class Book {
 String title;
 String author;

 // Constructor
 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 // Display book details
 void display() {
     System.out.println(title + " by " + author);
 }
}
