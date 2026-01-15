package com.day2.bookshelf;
/*
Manages books using HashMap and LinkedList
*/

import java.util.HashMap;
import java.util.LinkedList;

class BookShelf {

    // genre -> list of books
    HashMap<String, LinkedList<Book>> shelf = new HashMap<>();

    // Add book
    void addBook(String genre, String title, String author) {

        if (!shelf.containsKey(genre)) {
            shelf.put(genre, new LinkedList<Book>());
        }

        shelf.get(genre).add(new Book(title, author));
    }

    // Remove book
    void removeBook(String genre, String title) {

        if (!shelf.containsKey(genre))
            return;

        LinkedList<Book> list = shelf.get(genre);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).title.equals(title)) {
                list.remove(i);
                return;
            }
        }
    }

    // Display all books
    void display() {

        for (String genre : shelf.keySet()) {

            System.out.println("\nGenre: " + genre);
            LinkedList<Book> list = shelf.get(genre);

            for (Book b : list) {
                System.out.println(b.title + " - " + b.author);
            }
        }
    }
}
