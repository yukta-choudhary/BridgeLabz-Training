package com.singlylinkedlist.studentrecordmanagement;
//Main class to test Student Linked List

import java.util.Scanner;

public class StudentMain {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     StudentLinkedList list = new StudentLinkedList();
     int choice;

     do {
         System.out.println("\n1.Add Beginning\n2.Add End\n3.Add Position\n4.Delete\n5.Search\n6.Update Grade\n7.Display\n0.Exit");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 list.addAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
                 break;

             case 2:
                 list.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
                 break;

             case 3:
                 list.addAtPosition(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
                 break;

             case 4:
                 list.deleteByRoll(sc.nextInt());
                 break;

             case 5:
                 list.searchByRoll(sc.nextInt());
                 break;

             case 6:
                 list.updateGrade(sc.nextInt(), sc.next().charAt(0));
                 break;

             case 7:
                 list.display();
                 break;
         }

     } while (choice != 0);

     sc.close();
 }
}

