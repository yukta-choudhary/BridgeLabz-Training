package com.encapsulation.ridehailingapp;

//Main class to demonstrate polymorphism
public class RideHailingMain {

 // Polymorphic method to calculate fare
 public static void processRide(Vehicle v, double distance) {

     v.getVehicleDetails();
     double fare = v.calculateFare(distance);

     if (v instanceof GPS) {
         GPS gps = (GPS) v;
         System.out.println("Current Location: " + gps.getCurrentLocation());
         gps.updateLocation("New Location");
         System.out.println("Updated Location: " + gps.getCurrentLocation());
     }

     System.out.println("Fare for " + distance + " km: " + fare);
     System.out.println("----------------------");
 }

 public static void main(String[] args) {

     Vehicle car = new Car("CAR101", "Rohit", 15);
     Vehicle bike = new Bike("BIKE202", "Sita", 10);
     Vehicle auto = new Auto("AUTO303", "Raj", 8);

     Vehicle[] rides = { car, bike, auto };
     double distance = 12; // km

     for (Vehicle v : rides) {
         processRide(v, distance);
     }
 }
}
