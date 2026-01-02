package com.day2.vehiclerentalapp;

//Truck
public class Truck extends Vehicle implements Rentable {

 public Truck(int id, String brand, double rate) {
     super(id, brand, rate);
 }

 @Override
 public double calculateRent(int days) {
     double heavyCharge = 500;
     return (baseRate * days) + heavyCharge;
 }

 @Override
 public void displayInfo() {
     System.out.println("Truck Brand: " + brand);
 }
}
