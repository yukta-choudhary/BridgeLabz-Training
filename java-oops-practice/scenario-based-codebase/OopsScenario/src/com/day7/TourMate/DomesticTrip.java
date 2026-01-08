package com.day7.TourMate;

//Domestic trip
public class DomesticTrip extends Trip
{
 public DomesticTrip(String destination, int duration,
                     Transport transport, Hotel hotel, Activity activity)
 {
     super(destination, duration, transport, hotel, activity);
 }

 // Polymorphism
 public void book()
 {
     System.out.println("Domestic trip booked");
     transport.book();
     hotel.book();
     activity.book();
 }
}
