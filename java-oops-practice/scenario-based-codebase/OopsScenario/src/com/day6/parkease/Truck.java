package com.day6.parkease;

//Truck class
public class Truck extends Vehicle {

 // Constructor
 public Truck(String vehicleNumber) {
     super(vehicleNumber, 100);
 }

 // Charges for truck
 public double calculateCharges(int hours) {
     if (hours > 5) {
         return (baseRate * hours) + 200;
     }
     return baseRate * hours;
 }
}
