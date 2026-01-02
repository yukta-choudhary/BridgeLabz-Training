package com.circularlinkedlist.taskscheduler;
//Main class for Task Scheduler

import java.util.Scanner;

public class TaskSchedulerMain {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     TaskCircularLinkedList list = new TaskCircularLinkedList();
     int choice;

     do {
         System.out.println(
             "\n1.Add Begin\n2.Add End\n3.Add Position\n4.Remove Task" +
             "\n5.View Next Task\n6.Display All\n7.Search Priority\n0.Exit"
         );

         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 list.addAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                 break;

             case 2:
                 list.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                 break;

             case 3:
                 list.addAtPosition(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                 break;

             case 4:
                 list.removeById(sc.nextInt());
                 break;

             case 5:
                 list.viewNextTask();
                 break;

             case 6:
                 list.displayAll();
                 break;

             case 7:
                 list.searchByPriority(sc.nextInt());
                 break;
         }

     } while (choice != 0);

     sc.close();
 }
}
