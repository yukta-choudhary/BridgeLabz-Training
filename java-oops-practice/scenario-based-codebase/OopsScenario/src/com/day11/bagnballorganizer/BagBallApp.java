package com.day11.bagnballorganizer;
//Main application to manage Bags and Balls

import java.util.Scanner;

public class BagBallApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of bags: ");
     int n = sc.nextInt();
     Bag[] bags = new Bag[n];

     // Create bags
     for (int i = 0; i < n; i++) {
         System.out.print("Enter Bag ID: ");
         String id = sc.next();
         System.out.print("Enter Bag color: ");
         String color = sc.next();
         System.out.print("Enter Bag capacity: ");
         int cap = sc.nextInt();

         bags[i] = new Bag(id, color, cap);
     }

     // Menu-driven actions
     int choice;
     do {
         System.out.println("\nMenu:");
         System.out.println("1. Add Ball to Bag");
         System.out.println("2. Remove Ball from Bag");
         System.out.println("3. Display Balls in Bag");
         System.out.println("4. Display All Bags Info");
         System.out.println("0. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter Bag index (0-" + (n-1) + "): ");
                 int bidx = sc.nextInt();
                 System.out.print("Enter Ball ID: ");
                 String bid = sc.next();
                 System.out.print("Enter Ball color: ");
                 String bcolor = sc.next();
                 System.out.print("Enter Ball size: ");
                 String bsize = sc.next();
                 Ball newBall = new Ball(bid, bcolor, bsize);
                 bags[bidx].addBall(newBall);
                 break;

             case 2:
                 System.out.print("Enter Bag index (0-" + (n-1) + "): ");
                 int ridx = sc.nextInt();
                 System.out.print("Enter Ball ID to remove: ");
                 String rid = sc.next();
                 bags[ridx].removeBall(rid);
                 break;

             case 3:
                 System.out.print("Enter Bag index (0-" + (n-1) + "): ");
                 int didx = sc.nextInt();
                 bags[didx].displayBalls();
                 break;

             case 4:
                 System.out.println("All Bags Info:");
                 for (int i = 0; i < n; i++) {
                     bags[i].displayInfo();
                 }
                 break;

             case 0:
                 System.out.println("Exiting...");
                 break;

             default:
                 System.out.println("Invalid choice");
         }

     } while (choice != 0);

     sc.close();
 }
}

