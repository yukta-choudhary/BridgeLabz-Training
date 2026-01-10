package com.day1.browserbuddy;

//BrowserTab
public class BrowserTab {

 HistoryNode current;

 // Visit new page
 void visit(String url) {
     HistoryNode newNode = new HistoryNode(url);

     if (current != null) {
         current.next = newNode;
         newNode.prev = current;
     }

     current = newNode;
     System.out.println("Visited: " + url);
 }

 // Go back
 void back() {
     if (current != null && current.prev != null) {
         current = current.prev;
         System.out.println("Back to: " + current.url);
     } else {
         System.out.println("No previous page.");
     }
 }

 // Go forward
 void forward() {
     if (current != null && current.next != null) {
         current = current.next;
         System.out.println("Forward to: " + current.url);
     } else {
         System.out.println("No next page.");
     }
 }

 // Show current page
 String getCurrentPage() {
     if (current == null)
         return "Empty Tab";
     return current.url;
 }
}
