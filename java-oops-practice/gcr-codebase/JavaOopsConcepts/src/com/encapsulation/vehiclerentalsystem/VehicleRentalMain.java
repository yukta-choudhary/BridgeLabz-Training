package com.encapsulation.vehiclerentalsystem;

//Main class to demonstrate polymorphism
public class VehicleRentalMain {

 public static void main(String[] args) {

     // Vehicle references
     Vehicle v1 = new Car("CAR101", 1000, "CAR-POL-1");
     Vehicle v2 = new Bike("BIKE202", 300, "BIKE-POL-2");
     Vehicle v3 = new Truck("TRUCK303", 2000, "TRUCK-POL-3");

     Vehicle[] vehicles = { v1, v2, v3 };

     int days = 3;

     // Polymorphism in action
     for (Vehicle v : vehicles) {

         double rent = v.calculateRentalCost(days);
         double insurance = 0;

         if (v instanceof Insurable) {
             insurance = ((Insurable) v).calculateInsurance();
         }

         System.out.println("Vehicle Type: " + v.getType());
         System.out.println("Rental Cost: " + rent);
         System.out.println("Insurance Cost: " + insurance);
         System.out.println("----------------------");
     }
 }
}

