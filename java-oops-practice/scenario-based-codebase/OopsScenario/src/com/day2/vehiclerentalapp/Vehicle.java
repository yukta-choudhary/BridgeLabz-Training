package com.day2.vehiclerentalapp;

//Vehicle
public class Vehicle {
 protected int vehicleId;        // protected for subclass access
 protected String brand;
 protected double baseRate;

 public Vehicle(int vehicleId, String brand, double baseRate) {
     this.vehicleId = vehicleId;
     this.brand = brand;
     this.baseRate = baseRate;
 }

 // Getters
 public int getVehicleId() {
     return vehicleId;
 }

 public String getBrand() {
     return brand;
 }

 public double getBaseRate() {
     return baseRate;
 }

 // Polymorphism
 public void displayInfo() {
     System.out.println("Vehicle Brand: " + brand);
 }
}
