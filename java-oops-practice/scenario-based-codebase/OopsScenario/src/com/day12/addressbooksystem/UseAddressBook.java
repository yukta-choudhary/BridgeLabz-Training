package com.day12.addressbooksystem;

//Tester class
import java.util.Scanner;

public class UseAddressBook{

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     AddressBook book = new AddressBook();

     while (true) {
         System.out.println("1.Add 2.Edit 3.Delete 4.Search 5.Display 6.Exit");
         int choice = sc.nextInt();
         sc.nextLine();

         if (choice == 1) {
             // Add contact
             System.out.print("First Name: ");
             String fn = sc.nextLine();

             System.out.print("Last Name: ");
             String ln = sc.nextLine();

             System.out.print("Phone: ");
             String ph = sc.nextLine();

             System.out.print("Email: ");
             String em = sc.nextLine();

             System.out.print("City: ");
             String city = sc.nextLine();

             System.out.print("State: ");
             String state = sc.nextLine();

             System.out.print("Zip: ");
             String zip = sc.nextLine();

             Address addr = new Address(city, state, zip);
             Contact c = new Contact(fn, ln, ph, em, addr);
             book.addContact(c);

         } else if (choice == 2) {
             // Edit contact
             System.out.print("Enter first name: ");
             String name = sc.nextLine();

             System.out.print("New Phone: ");
             String ph = sc.nextLine();

             System.out.print("New Email: ");
             String em = sc.nextLine();

             book.editContact(name, ph, em);

         } else if (choice == 3) {
             // Delete contact
             System.out.print("Enter first name: ");
             String name = sc.nextLine();
             book.deleteContact(name);

         } else if (choice == 4) {
             // Search
             System.out.print("Enter city or state: ");
             String val = sc.nextLine();
             book.searchByLocation(val);

         } else if (choice == 5) {
             // Display all
             book.displaySorted();

         } else {
             // Exit
             System.out.println("Exiting...");
             break;
         }
     }
     sc.close();
 }
}

