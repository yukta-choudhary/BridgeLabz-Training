package com.day2.vehiclerentalapp;

//Car
public class Car extends Vehicle implements Rentable {

 public Car(int id, String brand, double rate) {
     super(id, brand, rate);
 }

 @Override
 public double calculateRent(int days) {
     double insurance = 200;   // extra charge
     return (baseRate * days) + insurance;
 }

 @Override
 public void displayInfo() {
     System.out.println("Car Brand: " + brand);
 }
}
