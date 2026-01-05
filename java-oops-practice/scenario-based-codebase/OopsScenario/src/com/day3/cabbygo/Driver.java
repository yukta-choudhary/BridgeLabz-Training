package com.day3.cabbygo;

//Driver class
public class Driver {

 String name;
 String licenseNumber;
 private double rating;   // private field

 // Constructor
 Driver(String name, String licenseNumber, double rating) {
     this.name = name;
     this.licenseNumber = licenseNumber;
     this.rating = rating;
 }

 // Get rating
 double getRating() {
     return rating;
 }
}
