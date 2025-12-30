package com.objectmodelling.book;

public class Book {

	 // Attributes
	 private String title;
	 private String author;

	 // Constructor
	 public Book(String title, String author) {
	     this.title = title;
	     this.author = author;
	 }

	 // Display book details
	 public void showBook() {
	     System.out.println("Title: " + title + ", Author: " + author);
	 }
}
