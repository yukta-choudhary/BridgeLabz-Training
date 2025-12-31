package com.inheritance.library;

/*
Subclass: Author
Inherits Book and adds author details
*/

public class Author extends Book {

    String name;
    String bio;

    // Method to display book + author details
    @Override
    void displayInfo() {
        super.displayInfo(); // Call Book method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
