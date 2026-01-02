package com.circularlinkedlist.onlineticketreservation;

//Node class for Circular Linked List (Ticket)

class TicketNode {
 int ticketId;
 String customerName;
 String movieName;
 int seatNumber;
 String bookingTime;
 TicketNode next;

 // Constructor
 TicketNode(int ticketId, String customerName,
            String movieName, int seatNumber, String bookingTime) {

     this.ticketId = ticketId;
     this.customerName = customerName;
     this.movieName = movieName;
     this.seatNumber = seatNumber;
     this.bookingTime = bookingTime;
     this.next = this; // circular link
 }
}
