package com.day1.bookmanagementsystem;

//Book class represents one book
public class Book {

	 // Attributes
	 int bookId;
	 String title;
	 String author;
	 boolean isIssued;
	
	 // Constructor
	 Book(int id, String t, String a) {
	     bookId = id;
	     title = t;
	     author = a;
	     isIssued = false;
	 }
	
	 // Method to issue book
	 void issueBook() {
	     isIssued = true;
	     System.out.println(title + " is issued.");
	 }
	
	 // Method to return book
	 void returnBook() {
	     isIssued = false;
	     System.out.println(title + " is returned.");
	 }
	
	 // Method to show book details
	 void showDetails() {
	     System.out.println("Book ID: " + bookId);
	     System.out.println("Title: " + title);
	     System.out.println("Author: " + author);
	     System.out.println("Issued: " + isIssued);
	 }
}
