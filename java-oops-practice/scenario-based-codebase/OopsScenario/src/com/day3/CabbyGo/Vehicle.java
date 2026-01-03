package com.day3.cabbygo;

//Parent class Vehicle
public class Vehicle {

 String vehicleNumber;
 int capacity;
 String type;
 private double fare;   // sensitive data

 // Constructor
 Vehicle(String vehicleNumber, int capacity, String type) {
     this.vehicleNumber = vehicleNumber;
     this.capacity = capacity;
     this.type = type;
 }

 // Set fare
 void setFare(double fare) {
     this.fare = fare;
 }

 // Get fare
 double getFare() {
     return fare;
 }
}

