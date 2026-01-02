package com.encapsulation.ridehailingapp;

//Auto class
public class Auto extends Vehicle implements GPS {

 private String currentLocation;

 public Auto(String id, String driver, double rate) {
     super(id, driver, rate);
     this.currentLocation = "Bus Stop";
 }

 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance + 10; // Auto service charge
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     currentLocation = newLocation;
 }
}
