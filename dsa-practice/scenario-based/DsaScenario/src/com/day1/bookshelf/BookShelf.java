package com.day1.bookshelf;

//BookShelf
import java.util.HashMap;
import java.util.LinkedList;

public class BookShelf {

    // Genre → List of Books
    HashMap<String, LinkedList<Book>> shelf = new HashMap<>();

    // Add book to genre
    void addBook(String genre, Book book) {

        // If genre does not exist, create it
        if (!shelf.containsKey(genre)) {
            shelf.put(genre, new LinkedList<>());
        }

        shelf.get(genre).add(book);
        System.out.println("Book added successfully.");
    }

    // Remove book from genre
    void removeBook(String genre, String title) {

        if (!shelf.containsKey(genre)) {
            System.out.println("Genre not found.");
            return;
        }

        LinkedList<Book> books = shelf.get(genre);

        for (Book b : books) {
            if (b.title.equals(title)) {
                books.remove(b);
                System.out.println("Book borrowed successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Display all books
    void displayShelf() {

        for (String genre : shelf.keySet()) {
            System.out.println("Genre: " + genre);

            for (Book b : shelf.get(genre)) {
                b.display();
            }
            System.out.println();
        }
    }
}

