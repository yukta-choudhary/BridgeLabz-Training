package com.day4.eventease;
//Birthday event class
public class BirthdayEvent extends Event implements ISchedulable {

 BirthdayEvent(int eventId, String name, String location, String date, int attendees,
               int serviceCost, int discount) {
     super(eventId, name, location, date, attendees, serviceCost, discount);
 }

 // Polymorphism
 public void schedule() {
     System.out.println("Birthday Event Scheduled");
 }

 public void reschedule() {
     System.out.println("Birthday Event Rescheduled");
 }

 public void cancel() {
     System.out.println("Birthday Event Cancelled");
 }
}
