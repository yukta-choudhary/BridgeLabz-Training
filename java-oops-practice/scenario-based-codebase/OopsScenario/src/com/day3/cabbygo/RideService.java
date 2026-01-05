package com.day3.cabbygo;
//Implements ride services
public class RideService implements IRideService {

 Vehicle vehicle;
 Driver driver;
 private double baseFare = 50;
 private double rate = 10;

 RideService(Vehicle vehicle, Driver driver) {
     this.vehicle = vehicle;
     this.driver = driver;
 }

 // Book ride
 public void bookRide(double distance) {
     double totalFare = baseFare + (distance * rate); // operator usage
     vehicle.setFare(totalFare);
     System.out.println("Ride booked with " + vehicle.type);
     System.out.println("Driver: " + driver.name);
     System.out.println("Fare: ₹" + vehicle.getFare());
 }

 // End ride
 public void endRide() {
     System.out.println("Ride ended. Thank you!");
 }
}
