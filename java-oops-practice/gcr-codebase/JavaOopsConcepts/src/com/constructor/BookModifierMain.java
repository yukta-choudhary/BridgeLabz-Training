package com.constructor;

public class BookModifierMain {

    public static void main(String[] args) {

        // Create EBook object
        EBook ebook = new EBook("ISBN12345", "Java Basics", "James Gosling");

        // Display ebook details
        ebook.displayEBookDetails();

        System.out.println();

        // Update author using setter
        ebook.setAuthor("Oracle Java Team");

        // Display updated details
        System.out.println("After Author Update:");
        ebook.displayEBookDetails();
    }
}
