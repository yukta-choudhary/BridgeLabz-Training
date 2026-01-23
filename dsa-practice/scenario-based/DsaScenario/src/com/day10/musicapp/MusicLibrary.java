package com.day10.musicapp;

import java.util.Scanner;

//Main class
public class MusicLibrary {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     SongBST bst = new SongBST();
     int choice;

     do {
         System.out.println("\n1.Insert 2.Search 3.Display 4.Exit");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 // Insert new track
                 System.out.print("Enter Track ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Song Title: ");
                 String title = sc.nextLine();
                 System.out.print("Enter Artist Name: ");
                 String artist = sc.nextLine();
                 bst.root = bst.insert(bst.root, id, title, artist);
                 break;

             case 2:
                 // Search track
                 System.out.print("Enter Track ID to search: ");
                 id = sc.nextInt();
                 bst.searchById(bst.root, id);
                 break;

             case 3:
                 // Display playlist alphabetically
                 System.out.println("Playlist (Alphabetical Order):");
                 bst.inorder(bst.root);
                 break;

             case 4:
                 System.out.println("Exit");
                 break;

             default:
                 System.out.println("Invalid choice");
         }
     } while (choice != 4);

     sc.close();
 }
}
