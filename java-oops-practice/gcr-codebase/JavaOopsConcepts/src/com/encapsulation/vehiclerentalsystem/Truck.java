package com.encapsulation.vehiclerentalsystem;

//Truck class
public class Truck extends Vehicle implements Insurable {

 private String insurancePolicyNumber;

 public Truck(String number, double rate, String policyNo) {
     super(number, "Truck", rate);
     this.insurancePolicyNumber = policyNo;
 }

 @Override
 public double calculateRentalCost(int days) {
     return getRentalRate() * days * 1.2; // extra load charge
 }

 @Override
 public double calculateInsurance() {
     return 1000;
 }

 @Override
 public String getInsuranceDetails() {
     return "Truck Insurance";
 }
}

