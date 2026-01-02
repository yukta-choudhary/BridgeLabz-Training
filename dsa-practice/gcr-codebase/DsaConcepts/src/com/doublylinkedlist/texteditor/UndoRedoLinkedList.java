package com.doublylinkedlist.texteditor;

//Doubly Linked List for Undo / Redo

class UndoRedoLinkedList {
 TextStateNode head;
 TextStateNode tail;
 TextStateNode current;

 int size = 0;
 int maxSize = 10;   // history limit

 // Add new text state
 void addState(String text) {
     TextStateNode newNode = new TextStateNode(text);

     // If list empty
     if (head == null) {
         head = tail = current = newNode;
         size = 1;
         return;
     }

     // Remove redo history
     if (current.next != null) {
         current.next.prev = null;
         current.next = null;
         tail = current;
     }

     // Add at end
     tail.next = newNode;
     newNode.prev = tail;
     tail = newNode;
     current = newNode;
     size++;

     // Limit history size
     if (size > maxSize) {
         head = head.next;
         head.prev = null;
         size--;
     }
 }

 // Undo operation
 void undo() {
     if (current == null || current.prev == null) {
         System.out.println("Nothing to undo");
         return;
     }
     current = current.prev;
 }

 // Redo operation
 void redo() {
     if (current == null || current.next == null) {
         System.out.println("Nothing to redo");
         return;
     }
     current = current.next;
 }

 // Display current text
 void displayCurrent() {
     if (current == null) {
         System.out.println("No text");
         return;
     }
     System.out.println("Current Text: " + current.text);
 }
}
