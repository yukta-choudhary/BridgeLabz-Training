package com.day1.bookshelf;

//Book class 
public class Book {

 String title;
 String author;

 // Constructor
 Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 // Display book details
 void display() {
     System.out.println(title + " by " + author);
 }
}

