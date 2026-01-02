package com.doublylinkedlist.librarymanagementsystem;

//Doubly Linked List for Library Management

class LibraryDoublyLinkedList {
 BookNode head;
 BookNode tail;

 // Add book at beginning
 void addAtBeginning(String t, String a, String g, int id, boolean av) {
     BookNode newNode = new BookNode(t, a, g, id, av);

     if (head == null) {
         head = tail = newNode;
         return;
     }

     newNode.next = head;
     head.prev = newNode;
     head = newNode;
 }

 // Add book at end
 void addAtEnd(String t, String a, String g, int id, boolean av) {
     BookNode newNode = new BookNode(t, a, g, id, av);

     if (head == null) {
         head = tail = newNode;
         return;
     }

     tail.next = newNode;
     newNode.prev = tail;
     tail = newNode;
 }

 // Add book at specific position
 void addAtPosition(int pos, String t, String a, String g, int id, boolean av) {
     if (pos == 1) {
         addAtBeginning(t, a, g, id, av);
         return;
     }

     BookNode temp = head;
     for (int i = 1; i < pos - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null || temp.next == null) {
         addAtEnd(t, a, g, id, av);
         return;
     }

     BookNode newNode = new BookNode(t, a, g, id, av);
     newNode.next = temp.next;
     newNode.prev = temp;
     temp.next.prev = newNode;
     temp.next = newNode;
 }

 // Remove book by ID
 void removeById(int id) {
     if (head == null) {
         System.out.println("Library empty");
         return;
     }

     BookNode temp = head;

     while (temp != null) {
         if (temp.bookId == id) {

             if (temp == head) {
                 head = head.next;
                 if (head != null) head.prev = null;
             }
             else if (temp == tail) {
                 tail = tail.prev;
                 tail.next = null;
             }
             else {
                 temp.prev.next = temp.next;
                 temp.next.prev = temp.prev;
             }

             System.out.println("Book removed");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Book not found");
 }

 // Search by title
 void searchByTitle(String title) {
     BookNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {
             displayBook(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("Book not found");
 }

 // Search by author
 void searchByAuthor(String author) {
     BookNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.author.equalsIgnoreCase(author)) {
             displayBook(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("Book not found");
 }

 // Update availability status
 void updateAvailability(int id, boolean av) {
     BookNode temp = head;

     while (temp != null) {
         if (temp.bookId == id) {
             temp.available = av;
             System.out.println("Availability updated");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Book not found");
 }

 // Display books forward
 void displayForward() {
     if (head == null) {
         System.out.println("No books");
         return;
     }

     BookNode temp = head;
     while (temp != null) {
         displayBook(temp);
         temp = temp.next;
     }
 }

 // Display books in reverse
 void displayReverse() {
     if (tail == null) {
         System.out.println("No books");
         return;
     }

     BookNode temp = tail;
     while (temp != null) {
         displayBook(temp);
         temp = temp.prev;
     }
 }

 // Count total books
 void countBooks() {
     int count = 0;
     BookNode temp = head;

     while (temp != null) {
         count++;
         temp = temp.next;
     }

     System.out.println("Total books = " + count);
 }

 // Display single book
 void displayBook(BookNode b) {
     System.out.println(
         b.bookId + " " +
         b.title + " " +
         b.author + " " +
         b.genre + " " +
         (b.available ? "Available" : "Not Available")
     );
 }
}
