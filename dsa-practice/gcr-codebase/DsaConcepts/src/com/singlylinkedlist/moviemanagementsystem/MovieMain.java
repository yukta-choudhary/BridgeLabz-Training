package com.singlylinkedlist.moviemanagementsystem;

//Main class for Movie Management System

import java.util.Scanner;

public class MovieMain {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     MovieDoublyLinkedList list = new MovieDoublyLinkedList();
     int choice;

     do {
         System.out.println(
             "\n1.Add Begin\n2.Add End\n3.Add Position\n4.Remove" +
             "\n5.Search Director\n6.Search Rating\n7.Update Rating" +
             "\n8.Display Forward\n9.Display Reverse\n0.Exit"
         );

         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 list.addAtBeginning(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                 break;

             case 2:
                 list.addAtEnd(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                 break;

             case 3:
                 list.addAtPosition(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                 break;

             case 4:
                 list.removeByTitle(sc.next());
                 break;

             case 5:
                 list.searchByDirector(sc.next());
                 break;

             case 6:
                 list.searchByRating(sc.nextDouble());
                 break;

             case 7:
                 list.updateRating(sc.next(), sc.nextDouble());
                 break;

             case 8:
                 list.displayForward();
                 break;

             case 9:
                 list.displayReverse();
                 break;
         }

     } while (choice != 0);

     sc.close();
 }
}
