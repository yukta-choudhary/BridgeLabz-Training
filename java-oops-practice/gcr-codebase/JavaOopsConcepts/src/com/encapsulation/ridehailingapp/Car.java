package com.encapsulation.ridehailingapp;
//Car class
public class Car extends Vehicle implements GPS {

 private String currentLocation;

 public Car(String id, String driver, double rate) {
     super(id, driver, rate);
     this.currentLocation = "City Center";
 }

 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance + 50; // Car service charge
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
