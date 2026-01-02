package com.encapsulation.ridehailingapp;

//Bike class
public class Bike extends Vehicle implements GPS {

 private String currentLocation;

 public Bike(String id, String driver, double rate) {
     super(id, driver, rate);
     this.currentLocation = "Main Street";
 }

 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance + 20; // Bike service charge
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

