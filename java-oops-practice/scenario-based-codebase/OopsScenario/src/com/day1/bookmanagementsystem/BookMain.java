package com.day1.bookmanagementsystem;

//Library class manages books
public class BookMain {

 public static void main(String[] args) {

     // Create book object
     Book b1 = new Book(101, "Java Basics", "James");

     // Show details
     b1.showDetails();

     // Issue book
     b1.issueBook();

     // Return book
     b1.returnBook();
 }
}
