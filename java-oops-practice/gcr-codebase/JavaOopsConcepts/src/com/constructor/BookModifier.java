package com.constructor;

public class BookModifier {

    // Public variable
    public String isbn;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Parameterized Constructor
    public BookModifier(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }
}

// Subclass to demonstrate protected access
class EBook extends BookModifier {

    // Constructor
    public EBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    // Method to display ebook details
    public void displayEBookDetails() {
        System.out.println("ISBN   : " + isbn);        // public
        System.out.println("Title  : " + title);       // protected
        System.out.println("Author : " + getAuthor()); // private via getter
    }
}
