package com.hashandhashmap.customhashmap;

//Custom HashMap implementation
public class MyHashMap {

 // Node class for linked list
 class Node {
     int key;
     int value;
     Node next;

     Node(int k, int v) {
         key = k;
         value = v;
         next = null;
     }
 }

 private int size = 5;              // bucket size
 private Node[] table = new Node[size];

 // Hash function
 private int hash(int key) {
     return key % size;
 }

 // Insert key-value pair
 public void put(int key, int value) {

     int idx = hash(key);
     Node head = table[idx];

     // If bucket empty
     if (head == null) {
         table[idx] = new Node(key, value);
         return;
     }

     // Traverse list
     Node curr = head;
     while (curr != null) {

         // Update value if key exists
         if (curr.key == key) {
             curr.value = value;
             return;
         }

         if (curr.next == null) {
             break;
         }
         curr = curr.next;
     }

     // Add new node
     curr.next = new Node(key, value);
 }

 // Get value by key
 public int get(int key) {

     int idx = hash(key);
     Node curr = table[idx];

     // Search key
     while (curr != null) {
         if (curr.key == key) {
             return curr.value;
         }
         curr = curr.next;
     }

     return -1; // not found
 }

 // Remove key-value pair
 public void remove(int key) {

     int idx = hash(key);
     Node curr = table[idx];
     Node prev = null;

     // Traverse list
     while (curr != null) {

         if (curr.key == key) {

             // Remove first node
             if (prev == null) {
                 table[idx] = curr.next;
             } 
             // Remove middle or last node
             else {
                 prev.next = curr.next;
             }
             return;
         }

         prev = curr;
         curr = curr.next;
     }
 }
}
