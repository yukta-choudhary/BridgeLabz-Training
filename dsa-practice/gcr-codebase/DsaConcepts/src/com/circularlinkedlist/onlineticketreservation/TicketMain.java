package com.circularlinkedlist.onlineticketreservation;

//Main class for Online Ticket Reservation System

import java.util.Scanner;

public class TicketMain {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     TicketCircularList list = new TicketCircularList();
     int choice;

     do {
         System.out.println(
             "\n1.Add Ticket\n2.Remove Ticket\n3.Display Tickets" +
             "\n4.Search Ticket\n5.Count Tickets\n0.Exit"
         );

         choice = sc.nextInt();
         sc.nextLine(); // clear buffer

         switch (choice) {
             case 1:
                 System.out.print("Enter Ticket ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();

                 System.out.print("Enter Customer Name: ");
                 String cname = sc.nextLine();

                 System.out.print("Enter Movie Name: ");
                 String mname = sc.nextLine();

                 System.out.print("Enter Seat Number: ");
                 int seat = sc.nextInt();
                 sc.nextLine();

                 System.out.print("Enter Booking Time: ");
                 String time = sc.nextLine();

                 list.addTicket(id, cname, mname, seat, time);
                 break;

             case 2:
                 System.out.print("Enter Ticket ID to remove: ");
                 list.removeTicket(sc.nextInt());
                 break;

             case 3:
                 list.displayTickets();
                 break;

             case 4:
                 System.out.print("Enter Customer or Movie Name: ");
                 list.searchTicket(sc.nextLine());
                 break;

             case 5:
                 System.out.println(
                     "Total Tickets = " + list.countTickets()
                 );
                 break;
         }

     } while (choice != 0);

     sc.close();
 }
}
