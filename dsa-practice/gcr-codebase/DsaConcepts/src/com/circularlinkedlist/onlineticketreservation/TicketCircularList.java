package com.circularlinkedlist.onlineticketreservation;

//Circular Linked List for Ticket Reservation

class TicketCircularList {
 TicketNode head;

 // Add ticket at end
 void addTicket(int id, String cname, String mname,
                int seat, String time) {

     TicketNode newNode =
         new TicketNode(id, cname, mname, seat, time);

     if (head == null) {
         head = newNode;
         return;
     }

     TicketNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     temp.next = newNode;
     newNode.next = head;
 }

 // Remove ticket by Ticket ID
 void removeTicket(int id) {
     if (head == null) {
         System.out.println("No tickets");
         return;
     }

     TicketNode temp = head;
     TicketNode prev = null;

     do {
         if (temp.ticketId == id) {

             // Only one node
             if (temp == head && temp.next == head) {
                 head = null;
             }
             // Delete head node
             else if (temp == head) {
                 TicketNode last = head;
                 while (last.next != head) {
                     last = last.next;
                 }
                 head = head.next;
                 last.next = head;
             }
             // Delete middle or last node
             else {
                 prev.next = temp.next;
             }

             System.out.println("Ticket removed");
             return;
         }

         prev = temp;
         temp = temp.next;

     } while (temp != head);

     System.out.println("Ticket not found");
 }

 // Display all tickets
 void displayTickets() {
     if (head == null) {
         System.out.println("No tickets booked");
         return;
     }

     TicketNode temp = head;
     do {
         System.out.println(
             "ID:" + temp.ticketId +
             " Name:" + temp.customerName +
             " Movie:" + temp.movieName +
             " Seat:" + temp.seatNumber +
             " Time:" + temp.bookingTime
         );
         temp = temp.next;
     } while (temp != head);
 }

 // Search ticket by Customer or Movie name
 void searchTicket(String key) {
     if (head == null) {
         System.out.println("No tickets");
         return;
     }

     TicketNode temp = head;
     boolean found = false;

     do {
         if (temp.customerName.equalsIgnoreCase(key) ||
             temp.movieName.equalsIgnoreCase(key)) {

             System.out.println(
                 "ID:" + temp.ticketId +
                 " Name:" + temp.customerName +
                 " Movie:" + temp.movieName
             );
             found = true;
         }
         temp = temp.next;
     } while (temp != head);

     if (!found) {
         System.out.println("No matching ticket found");
     }
 }

 // Count total tickets
 int countTickets() {
     if (head == null)
         return 0;

     int count = 0;
     TicketNode temp = head;

     do {
         count++;
         temp = temp.next;
     } while (temp != head);

     return count;
 }
}
