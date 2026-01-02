package com.doublylinkedlist.librarymanagementsystem;

//Node class for Doubly Linked List

class BookNode {
 String title;
 String author;
 String genre;
 int bookId;
 boolean available;

 BookNode next;
 BookNode prev;

 // Constructor
 BookNode(String title, String author, String genre, int bookId, boolean available) {
     this.title = title;
     this.author = author;
     this.genre = genre;
     this.bookId = bookId;
     this.available = available;
     this.next = null;
     this.prev = null;
 }
}
