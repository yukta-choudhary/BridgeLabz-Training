package com.objectmodelling.book;

import java.util.ArrayList;

import com.objectmodelling.Book;

public class BookLibrary {

	 // Library name
	 private String libraryName;
	
	 // Aggregation: BookLibrary has many Book objects
	 private ArrayList<Book> books;
	
	 // Constructor
	 public BookLibrary(String libraryName) {
	     this.libraryName = libraryName;
	     books = new ArrayList<>();
	 }
	
	 // Add book to library
	 public void addBook(Book book) {
	     books.add(book);
	 }
	
	 // Show all books
	 public void showBooks() {
	     System.out.println("Books in " + libraryName + ":");
	     for (Book b : books) {
	         b.showBook();
	     }
	 }
}

