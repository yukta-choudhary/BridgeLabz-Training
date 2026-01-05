package com.day3.cabbygo;

//Main class
import java.util.Scanner;

public class CabbyGoMain {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Driver input
     System.out.print("Enter driver name: ");
     String dName = sc.nextLine();

     System.out.print("Enter license number: ");
     String license = sc.nextLine();

     System.out.print("Enter driver rating: ");
     double rating = sc.nextDouble();

     Driver driver = new Driver(dName, license, rating);

     sc.nextLine(); // clear buffer

     // Vehicle choice
     System.out.print("Enter vehicle type (Mini/Sedan/SUV): ");
     String vType = sc.nextLine();

     System.out.print("Enter vehicle number: ");
     String vNumber = sc.nextLine();

     Vehicle vehicle;

     // Polymorphism
     if (vType.equalsIgnoreCase("Mini")) {
         vehicle = new Mini(vNumber);
     } else if (vType.equalsIgnoreCase("Sedan")) {
         vehicle = new Sedan(vNumber);
     } else {
         vehicle = new SUV(vNumber);
     }

     // Distance input
     System.out.print("Enter distance in km: ");
     double distance = sc.nextDouble();

     RideService ride = new RideService(vehicle, driver);
     ride.bookRide(distance);
     ride.endRide();

     sc.close();
 }
}
