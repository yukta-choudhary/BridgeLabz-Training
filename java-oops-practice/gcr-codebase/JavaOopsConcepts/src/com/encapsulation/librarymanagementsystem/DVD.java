package com.encapsulation.librarymanagementsystem;

//DVD class
public class DVD extends LibraryItem implements Reservable {

 private boolean available = true;

 public DVD(int id, String title, String author) {
     super(id, title, author);
 }

 // 3 days loan
 @Override
 public int getLoanDuration() {
     return 3;
 }

 @Override
 public void reserveItem() {
     available = false;
     System.out.println("DVD reserved");
 }

 @Override
 public boolean checkAvailability() {
     return available;
 }
}
