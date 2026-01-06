package com.day4.eventease;

//Main class
import java.util.Scanner;

public class EventEaseApp {

 // Question:
 // Implement EventEase booking and scheduling module

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Organizer input
     System.out.print("Enter organizer name: ");
     String uname = sc.nextLine();

     System.out.print("Enter email: ");
     String email = sc.nextLine();

     User u = new User(uname, email);

     // Event input
     System.out.print("Event type (birthday/conference): ");
     String type = sc.nextLine();

     System.out.print("Event name: ");
     String ename = sc.nextLine();

     System.out.print("Location: ");
     String loc = sc.nextLine();

     System.out.print("Date: ");
     String date = sc.nextLine();

     System.out.print("Attendees: ");
     int att = sc.nextInt();

     System.out.print("Service cost: ");
     int scost = sc.nextInt();

     System.out.print("Discount: ");
     int disc = sc.nextInt();

     ISchedulable e;

     if (type.equals("birthday")) {
         e = new BirthdayEvent(101, ename, loc, date, att, scost, disc);
     } else {
         e = new ConferenceEvent(102, ename, loc, date, att, scost, disc);
     }

     // Scheduling
     e.schedule();

     // Cost output
     Event ev = (Event) e;
     System.out.println("Total Cost: " + ev.calculateCost());

     sc.close();
 }
}

