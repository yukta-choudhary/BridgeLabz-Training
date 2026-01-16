package com.day4.smartshelf;
import java.util.Scanner;

public class SmartShelf {

    // Insertion Sort by book title
    static void insertionSort(Book[] books, int n) {
        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            // Shift books greater than key
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // Place book at correct position
            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        // Input books one by one
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter book " + (i + 1));
            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            books[i] = new Book(title, author);

            // Sort as books are added (real-time)
            insertionSort(books, i + 1);
        }

        System.out.println("\nBooks sorted alphabetically:");
        for (int i = 0; i < n; i++) {
            books[i].display();
        }

        sc.close();
    }
}

