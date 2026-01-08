package com.day7.TourMate;

//International trip
public class InternationalTrip extends Trip
{
 public InternationalTrip(String destination, int duration,
                          Transport transport, Hotel hotel, Activity activity)
 {
     super(destination, duration, transport, hotel, activity);
 }

 // Polymorphism
 public void book()
 {
     System.out.println("International trip booked with passport check");
     transport.book();
     hotel.book();
     activity.book();
 }
}

