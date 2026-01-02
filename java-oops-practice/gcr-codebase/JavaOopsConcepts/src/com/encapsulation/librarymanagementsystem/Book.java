package com.encapsulation.librarymanagementsystem;

//Book class
public class Book extends LibraryItem implements Reservable {

 private boolean available = true;

 public Book(int id, String title, String author) {
     super(id, title, author);
 }

 // 14 days loan
 @Override
 public int getLoanDuration() {
     return 14;
 }

 @Override
 public void reserveItem() {
     available = false;
     System.out.println("Book reserved");
 }

 @Override
 public boolean checkAvailability() {
     return available;
 }
}
