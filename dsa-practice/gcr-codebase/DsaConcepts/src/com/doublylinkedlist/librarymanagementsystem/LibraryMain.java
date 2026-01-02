package com.doublylinkedlist.librarymanagementsystem;

//Main class for Library Management System

import java.util.Scanner;

public class LibraryMain {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     LibraryDoublyLinkedList list = new LibraryDoublyLinkedList();
     int choice;

     do {
         System.out.println(
             "\n1.Add Begin\n2.Add End\n3.Add Position\n4.Remove Book" +
             "\n5.Search Title\n6.Search Author\n7.Update Availability" +
             "\n8.Display Forward\n9.Display Reverse\n10.Count Books\n0.Exit"
         );

         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 list.addAtBeginning(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean());
                 break;

             case 2:
                 list.addAtEnd(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean());
                 break;

             case 3:
                 list.addAtPosition(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean());
                 break;

             case 4:
                 list.removeById(sc.nextInt());
                 break;

             case 5:
                 list.searchByTitle(sc.next());
                 break;

             case 6:
                 list.searchByAuthor(sc.next());
                 break;

             case 7:
                 list.updateAvailability(sc.nextInt(), sc.nextBoolean());
                 break;

             case 8:
                 list.displayForward();
                 break;

             case 9:
                 list.displayReverse();
                 break;

             case 10:
                 list.countBooks();
                 break;
         }

     } while (choice != 0);

     sc.close();
 }
}

