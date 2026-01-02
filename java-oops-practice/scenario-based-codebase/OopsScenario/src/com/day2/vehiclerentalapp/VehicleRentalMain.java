package com.day2.vehiclerentalapp;

//VehicleRentalMain
public class VehicleRentalMain {
 public static void main(String[] args) {

     Customer c1 = new Customer(1, "Amit");

     Rentable bike = new Bike(101, "Honda", 300);
     Rentable car = new Car(102, "Hyundai", 1000);
     Rentable truck = new Truck(103, "Tata", 2000);

     c1.displayCustomer();

     System.out.println("Bike Rent for 3 days: " + bike.calculateRent(3));
     System.out.println("Car Rent for 3 days: " + car.calculateRent(3));
     System.out.println("Truck Rent for 3 days: " + truck.calculateRent(3));
 }
}
