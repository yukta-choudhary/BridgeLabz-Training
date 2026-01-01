package com.encapsulation.vehiclerentalsystem;

//Abstract class Vehicle
public abstract class Vehicle {

 // Encapsulated fields
 private String vehicleNumber;
 private String type;
 private double rentalRate;

 // Constructor
 public Vehicle(String vehicleNumber, String type, double rentalRate) {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     this.rentalRate = rentalRate;
 }

 // Getters and setters
 public String getVehicleNumber() {
     return vehicleNumber;
 }

 public void setVehicleNumber(String vehicleNumber) {
     this.vehicleNumber = vehicleNumber;
 }

 public String getType() {
     return type;
 }

 public double getRentalRate() {
     return rentalRate;
 }

 public void setRentalRate(double rentalRate) {
     this.rentalRate = rentalRate;
 }

 // Abstract method
 public abstract double calculateRentalCost(int days);
}

