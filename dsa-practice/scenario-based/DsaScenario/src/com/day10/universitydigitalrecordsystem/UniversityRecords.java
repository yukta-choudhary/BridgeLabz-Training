package com.day10.universitydigitalrecordsystem;
import java.util.Scanner;

//Main class
public class UniversityRecords {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     StudentBst bst = new StudentBst();
     int choice;

     do {
         System.out.println("\n1.Insert 2.Delete 3.Search 4.Display 5.Exit");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 // Insert
                 System.out.print("Enter roll: ");
                 int r = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter name: ");
                 String n = sc.nextLine();
                 bst.root = bst.insert(bst.root, r, n);
                 break;

             case 2:
                 // Delete
                 System.out.print("Enter roll to delete: ");
                 r = sc.nextInt();
                 bst.root = bst.delete(bst.root, r);
                 break;

             case 3:
                 // Search
                 System.out.print("Enter roll to search: ");
                 r = sc.nextInt();
                 bst.search(bst.root, r);
                 break;

             case 4:
                 // Display sorted rolls
                 System.out.println("Student Records (Sorted):");
                 bst.inorder(bst.root);
                 break;

             case 5:
                 System.out.println("Exit");
                 break;

             default:
                 System.out.println("Invalid choice");
         }
     } while (choice != 5);

     sc.close();
 }
}

