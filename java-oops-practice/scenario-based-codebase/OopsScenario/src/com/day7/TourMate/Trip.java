package com.day7.TourMate;

/*
Parent Trip class
*/

public class Trip
{
    String destination;
    int duration;

    Transport transport;
    Hotel hotel;
    Activity activity;

    // Constructor for complete trip
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity)
    {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;
    }

    // Total budget using operators
    public double calculateBudget()
    {
        return transport.getCost()
             + hotel.getCost()
             + activity.getCost();
    }

    // Booking method (to be overridden)
    public void book()
    {
        System.out.println("Trip booked");
    }
}
