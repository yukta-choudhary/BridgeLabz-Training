package com.doublylinkedlist.texteditor;

//Node class for text state (Doubly Linked List)

class TextStateNode {
 String text;
 TextStateNode next;
 TextStateNode prev;

 // Constructor
 TextStateNode(String text) {
     this.text = text;
     this.next = null;
     this.prev = null;
 }
}
