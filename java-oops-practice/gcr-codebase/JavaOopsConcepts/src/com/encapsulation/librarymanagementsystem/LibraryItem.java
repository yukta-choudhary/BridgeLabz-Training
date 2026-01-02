package com.encapsulation.librarymanagementsystem;

//Abstract class LibraryItem
public abstract class LibraryItem {

 // Encapsulated fields
 private int itemId;
 private String title;
 private String author;

 // Sensitive borrower data
 private String borrowerName;

 // Constructor
 public LibraryItem(int itemId, String title, String author) {
     this.itemId = itemId;
     this.title = title;
     this.author = author;
 }

 // Getters and setters
 public int getItemId() {
     return itemId;
 }

 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }

 // Borrower data access (controlled)
 public void setBorrowerName(String borrowerName) {
     this.borrowerName = borrowerName;
 }

 public String getBorrowerName() {
     return borrowerName;
 }

 // Abstract method
 public abstract int getLoanDuration();

 // Concrete method
 public void getItemDetails() {
     System.out.println("ID: " + itemId);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
 }
}

