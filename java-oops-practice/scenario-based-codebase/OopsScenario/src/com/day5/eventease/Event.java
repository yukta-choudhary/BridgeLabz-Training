package com.day5.eventease;

//Base Event class
public class Event {

 String eventName;
 String location;
 String date;
 int attendees;

 private final int eventId; // cannot be changed
 protected int venueCost;
 protected int serviceCost;
 protected int discount;

 // Constructor without services
 Event(int eventId, String eventName, String location, String date, int attendees) {
     this.eventId = eventId;
     this.eventName = eventName;
     this.location = location;
     this.date = date;
     this.attendees = attendees;
     venueCost = 5000;
 }

 // Constructor with services
 Event(int eventId, String eventName, String location, String date, int attendees,
       int serviceCost, int discount) {
     this(eventId, eventName, location, date, attendees);
     this.serviceCost = serviceCost;
     this.discount = discount;
 }

 // Cost calculation
 int calculateCost() {
     return venueCost + serviceCost - discount;
 }
}

