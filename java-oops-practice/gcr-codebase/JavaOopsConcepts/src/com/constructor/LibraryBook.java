package com.constructor;

public class LibraryBook {
	   // Attributes
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Parameterized Constructor
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Method to display book details
    public void display() {
        System.out.println("Book Title   : " + title);
        System.out.println("Author Name  : " + author);
        System.out.println("Book Price   : " + price);
        System.out.println("Availability : " + available);
    }
}
