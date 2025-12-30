package com.objectmodelling.book;

public class BookMain {

 public static void main(String[] args) {

     // Create Book objects (independent)
     Book book1 = new Book("Java Basics", "James Gosling");
     Book book2 = new Book("Clean Code", "Robert Martin");
     Book book3 = new Book("Data Structures", "Mark Allen");

     // Create BookLibrary objects
     BookLibrary library1 = new BookLibrary("City Library");
     BookLibrary library2 = new BookLibrary("College Library");

     // Add books to libraries
     library1.addBook(book1);
     library1.addBook(book2);

     library2.addBook(book2); // Same book in different library
     library2.addBook(book3);

     // Display books in libraries
     library1.showBooks();
     System.out.println();
     library2.showBooks();
 }
}
