package com.day4.eventease;

//Conference event class
public class ConferenceEvent extends Event implements ISchedulable {

 ConferenceEvent(int eventId, String name, String location, String date, int attendees,
                 int serviceCost, int discount) {
     super(eventId, name, location, date, attendees, serviceCost, discount);
 }

 // Polymorphism
 public void schedule() {
     System.out.println("Conference Event Scheduled");
 }

 public void reschedule() {
     System.out.println("Conference Event Rescheduled");
 }

 public void cancel() {
     System.out.println("Conference Event Cancelled");
 }
}
