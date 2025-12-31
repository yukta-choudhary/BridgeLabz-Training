package com.inheritance.library;

/*
Superclass: Book
Stores common book details
*/

public class Book {

    String title;
    int publicationYear;

    // Method to display book details
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
