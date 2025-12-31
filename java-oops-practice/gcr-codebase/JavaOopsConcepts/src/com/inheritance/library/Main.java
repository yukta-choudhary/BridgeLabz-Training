package com.inheritance.library;

/*
Main class to test single inheritance
*/

public class Main {

    public static void main(String[] args) {

        // Create Author object
        Author author = new Author();

        // Set book details
        author.title = "Java Basics";
        author.publicationYear = 2024;

        // Set author details
        author.name = "Rahul Sharma";
        author.bio = "Java Trainer and Software Developer";

        // Display all details
        author.displayInfo();
    }
}
