package com.constructor;

public class HotelBookingMain {

    public static void main(String[] args) {

        // Booking using default constructor
        HotelBooking b1 = new HotelBooking();
        System.out.println("Default Booking Details:");
        b1.display();

        System.out.println();

        // Booking using parameterized constructor
        HotelBooking b2 = new HotelBooking("Yukta", "Deluxe", 3);
        System.out.println("Parameterized Booking Details:");
        b2.display();

        System.out.println();

        // Booking using copy constructor
        HotelBooking b3 = new HotelBooking(b2);
        System.out.println("Copied Booking Details:");
        b3.display();
    }
}
