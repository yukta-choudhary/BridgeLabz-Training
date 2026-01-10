package com.day1.browserbuddy;

//BrowserApp
import java.util.Scanner;

public class BrowserApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     BrowserManager manager = new BrowserManager();
     BrowserTab tab = new BrowserTab();

     int choice;

     do {
         System.out.println("\n1. Visit Page");
         System.out.println("2. Back");
         System.out.println("3. Forward");
         System.out.println("4. Close Tab");
         System.out.println("5. Reopen Tab");
         System.out.println("6. Current Page");
         System.out.println("7. Exit");

         choice = sc.nextInt();
         sc.nextLine();

         switch (choice) {

             case 1:
                 System.out.print("Enter URL: ");
                 String url = sc.nextLine();
                 tab.visit(url);
                 break;

             case 2:
                 tab.back();
                 break;

             case 3:
                 tab.forward();
                 break;

             case 4:
                 manager.closeTab(tab);
                 tab = new BrowserTab();
                 break;

             case 5:
                 tab = manager.reopenTab();
                 break;

             case 6:
                 System.out.println("Current Page: " + tab.getCurrentPage());
                 break;

             case 7:
                 System.out.println("Browser closed.");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }

     } while (choice != 7);

     sc.close();
 }
}
