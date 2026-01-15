package com.day2.bookshelf;

/*
BookShelf – Library Organizer
Main class
*/

import java.util.Scanner;

class LibraryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf bs = new BookShelf();
        int choice;

        do {
            System.out.println("\n1.Add Book");
            System.out.println("2.Remove Book");
            System.out.println("3.Display Books");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    bs.addBook(genre, title, author);
                    break;

                case 2:
                    System.out.print("Enter genre: ");
                    String g = sc.nextLine();

                    System.out.print("Enter title: ");
                    String t = sc.nextLine();

                    bs.removeBook(g, t);
                    break;

                case 3:
                    bs.display();
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}
