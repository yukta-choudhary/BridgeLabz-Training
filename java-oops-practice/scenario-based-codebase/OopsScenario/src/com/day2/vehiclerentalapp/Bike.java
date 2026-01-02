package com.day2.vehiclerentalapp;

//Bike
public class Bike extends Vehicle implements Rentable {

 public Bike(int id, String brand, double rate) {
     super(id, brand, rate);
 }

 @Override
 public double calculateRent(int days) {
     return baseRate * days;   // simple rent
 }

 @Override
 public void displayInfo() {
     System.out.println("Bike Brand: " + brand);
 }
}
