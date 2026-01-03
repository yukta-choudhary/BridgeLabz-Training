package com.stacksandqueues.queueusingstack;

import java.util.Scanner;

//Main class
public class UseMyQueue {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     MyQueue q = new MyQueue();

     System.out.print("Enter number of operations: ");
     int n = sc.nextInt();

     // Perform operations
     for (int i = 0; i < n; i++) {

         System.out.println("1.Enqueue  2.Dequeue");
         int choice = sc.nextInt();

         if (choice == 1) {
             System.out.print("Enter value: ");
             int val = sc.nextInt();
             q.enqueue(val);
         } 
         else if (choice == 2) {
             int res = q.dequeue();
             if (res == -1) {
                 System.out.println("Queue is empty");
             } else {
                 System.out.println("Dequeued: " + res);
             }
         }
     }

     sc.close();
 }
}
