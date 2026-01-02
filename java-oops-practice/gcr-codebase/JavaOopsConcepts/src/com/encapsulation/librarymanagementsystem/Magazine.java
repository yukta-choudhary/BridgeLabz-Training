package com.encapsulation.librarymanagementsystem;

//Magazine class
public class Magazine extends LibraryItem implements Reservable {

 private boolean available = true;

 public Magazine(int id, String title, String author) {
     super(id, title, author);
 }

 // 7 days loan
 @Override
 public int getLoanDuration() {
     return 7;
 }

 @Override
 public void reserveItem() {
     available = false;
     System.out.println("Magazine reserved");
 }

 @Override
 public boolean checkAvailability() {
     return available;
 }
}
