package com.singlylinkedlist.moviemanagementsystem;

//Doubly Linked List for Movie Management

class MovieDoublyLinkedList {
 MovieNode head;
 MovieNode tail;

 // Add movie at beginning
 void addAtBeginning(String t, String d, int y, double r) {
     MovieNode newNode = new MovieNode(t, d, y, r);

     if (head == null) {
         head = tail = newNode;
         return;
     }

     newNode.next = head;
     head.prev = newNode;
     head = newNode;
 }

 // Add movie at end
 void addAtEnd(String t, String d, int y, double r) {
     MovieNode newNode = new MovieNode(t, d, y, r);

     if (head == null) {
         head = tail = newNode;
         return;
     }

     tail.next = newNode;
     newNode.prev = tail;
     tail = newNode;
 }

 // Add movie at specific position
 void addAtPosition(int pos, String t, String d, int y, double r) {
     if (pos == 1) {
         addAtBeginning(t, d, y, r);
         return;
     }

     MovieNode temp = head;
     for (int i = 1; i < pos - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null || temp.next == null) {
         addAtEnd(t, d, y, r);
         return;
     }

     MovieNode newNode = new MovieNode(t, d, y, r);
     newNode.next = temp.next;
     newNode.prev = temp;
     temp.next.prev = newNode;
     temp.next = newNode;
 }

 // Remove movie by title
 void removeByTitle(String title) {
     if (head == null) {
         System.out.println("List empty");
         return;
     }

     MovieNode temp = head;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {

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

             System.out.println("Movie removed");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Movie not found");
 }

 // Search movie by director
 void searchByDirector(String director) {
     MovieNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.director.equalsIgnoreCase(director)) {
             displayMovie(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No movie found");
 }

 // Search movie by rating
 void searchByRating(double rating) {
     MovieNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.rating == rating) {
             displayMovie(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No movie found");
 }

 // Update rating by title
 void updateRating(String title, double newRating) {
     MovieNode temp = head;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {
             temp.rating = newRating;
             System.out.println("Rating updated");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Movie not found");
 }

 // Display forward
 void displayForward() {
     if (head == null) {
         System.out.println("No movies");
         return;
     }

     MovieNode temp = head;
     while (temp != null) {
         displayMovie(temp);
         temp = temp.next;
     }
 }

 // Display reverse
 void displayReverse() {
     if (tail == null) {
         System.out.println("No movies");
         return;
     }

     MovieNode temp = tail;
     while (temp != null) {
         displayMovie(temp);
         temp = temp.prev;
     }
 }

 // Display single movie
 void displayMovie(MovieNode m) {
     System.out.println(
         m.title + " " +
         m.director + " " +
         m.year + " " +
         m.rating
     );
 }
}
