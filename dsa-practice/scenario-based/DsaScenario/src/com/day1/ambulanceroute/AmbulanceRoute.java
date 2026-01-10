package com.day1.ambulanceroute;

//AmbulanceRoute.java
public class AmbulanceRoute {

 UnitNode head = null;

 // Add unit to circular list
 void addUnit(String name, boolean available) {

     UnitNode newNode = new UnitNode(name, available);

     if (head == null) {
         head = newNode;
         newNode.next = head;
         return;
     }

     UnitNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     temp.next = newNode;
     newNode.next = head;
 }

 // Find nearest available unit
 void findAvailableUnit() {

     if (head == null) {
         System.out.println("No units available.");
         return;
     }

     UnitNode temp = head;

     do {
         if (temp.available) {
             System.out.println("Patient sent to: " + temp.unitName);
             return;
         }
         temp = temp.next;
     } while (temp != head);

     System.out.println("All units are busy.");
 }

 // Remove unit under maintenance
 void removeUnit(String name) {

     if (head == null)
         return;

     UnitNode curr = head;
     UnitNode prev = null;

     do {
         if (curr.unitName.equals(name)) {

             if (curr == head) {
                 UnitNode last = head;
                 while (last.next != head) {
                     last = last.next;
                 }
                 head = head.next;
                 last.next = head;
             } else {
                 prev.next = curr.next;
             }

             System.out.println(name + " removed (maintenance).");
             return;
         }

         prev = curr;
         curr = curr.next;

     } while (curr != head);

     System.out.println("Unit not found.");
 }

 // Display route
 void displayRoute() {

     if (head == null)
         return;

     UnitNode temp = head;

     do {
         System.out.print(temp.unitName + " → ");
         temp = temp.next;
     } while (temp != head);

     System.out.println("(back to " + head.unitName + ")");
 }
}
