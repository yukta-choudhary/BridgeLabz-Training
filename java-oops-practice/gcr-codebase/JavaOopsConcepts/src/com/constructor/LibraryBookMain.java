package com.constructor;

public class LibraryBookMain {

    public static void main(String[] args) {

        // Create LibraryBook object
        LibraryBook book = new LibraryBook(
                "Java Programming",
                "James Gosling",
                599.0,
                true
        );

        // Display book details
        System.out.println("Library Book Details:");
        book.display();

        System.out.println();

        // Borrow the book
        book.borrowBook();

        System.out.println();

        // Display details after borrowing
        System.out.println("Library Book Details After Borrowing:");
        book.display();
    }
}
