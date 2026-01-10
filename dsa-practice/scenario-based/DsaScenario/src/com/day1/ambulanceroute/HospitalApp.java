package com.day1.ambulanceroute;
//HospitalApp.java
import java.util.Scanner;

public class HospitalApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     AmbulanceRoute route = new AmbulanceRoute();

     // Initial units
     route.addUnit("Emergency", true);
     route.addUnit("Radiology", false);
     route.addUnit("Surgery", true);
     route.addUnit("ICU", false);

     int choice;

     do {
         System.out.println("\n1. Display Units");
         System.out.println("2. Send Patient");
         System.out.println("3. Remove Unit");
         System.out.println("4. Exit");

         choice = sc.nextInt();
         sc.nextLine();

         switch (choice) {

             case 1:
                 route.displayRoute();
                 break;

             case 2:
                 route.findAvailableUnit();
                 break;

             case 3:
                 System.out.print("Enter unit name: ");
                 String name = sc.nextLine();
                 route.removeUnit(name);
                 break;

             case 4:
                 System.out.println("System closed.");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }

     } while (choice != 4);

     sc.close();
 }
}

