package com.day1.bookshelf;

//LibraryApp.java
import java.util.Scanner;

public class LibraryApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     BookShelf shelf = new BookShelf();

     int choice;

     do {
         System.out.println("1. Add Book");
         System.out.println("2. Borrow Book");
         System.out.println("3. Display Shelf");
         System.out.println("4. Exit");
         System.out.println("Enter choice(1/2/3/4): ");
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

                 Book book = new Book(title, author);
                 shelf.addBook(genre, book);
                 break;

             case 2:
                 System.out.print("Enter genre: ");
                 String g = sc.nextLine();

                 System.out.print("Enter title: ");
                 String t = sc.nextLine();

                 shelf.removeBook(g, t);
                 break;

             case 3:
                 shelf.displayShelf();
                 break;

             case 4:
                 System.out.println("Thank you!");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }

     } while (choice != 4);

     sc.close();
 }
}
