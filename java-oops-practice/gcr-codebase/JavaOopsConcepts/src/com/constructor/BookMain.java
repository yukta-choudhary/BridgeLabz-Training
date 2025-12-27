package com.constructor;

public class BookMain {
	public static void main(String[] args) {

        // Object using default constructor
        Book book1 = new Book();
        System.out.println("Default Constructor Output:");
        book1.display();

        System.out.println();

        // Object using parameterized constructor
        Book book2 = new Book("Java Basics", "James Gosling", 499.50);
        System.out.println("Parameterized Constructor Output:");
        book2.display();
    }
}
