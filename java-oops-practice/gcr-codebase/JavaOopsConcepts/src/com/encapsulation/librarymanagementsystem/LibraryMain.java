package com.encapsulation.librarymanagementsystem;

//Main class to demonstrate polymorphism
public class LibraryMain{

 public static void main(String[] args) {

     // Polymorphism using LibraryItem reference
     LibraryItem item1 = new Book(1, "Java Basics", "James");
     LibraryItem item2 = new Magazine(2, "Tech Today", "Editorial");
     LibraryItem item3 = new DVD(3, "Learning Java", "Oracle");

     LibraryItem[] items = { item1, item2, item3 };

     for (LibraryItem item : items) {

         item.getItemDetails();
         System.out.println("Loan Duration: " +
                 item.getLoanDuration() + " days");

         // Reservation handling
         if (item instanceof Reservable) {
             Reservable r = (Reservable) item;
             if (r.checkAvailability()) {
                 r.reserveItem();
             }
         }

         System.out.println("----------------------");
     }
 }
}
