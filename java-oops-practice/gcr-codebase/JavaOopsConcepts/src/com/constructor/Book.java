package com.constructor;

public class Book {
	// Attributes (private for encapsulation)
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        title = "Not Assigned";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Book Title  : " + title);
        System.out.println("Author Name: " + author);
        System.out.println("Book Price : " + price);
    }
}

