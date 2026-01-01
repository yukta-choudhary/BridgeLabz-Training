package com.encapsulation.vehiclerentalsystem;

//Bike class
public class Bike extends Vehicle implements Insurable {

 private String insurancePolicyNumber;

 public Bike(String number, double rate, String policyNo) {
     super(number, "Bike", rate);
     this.insurancePolicyNumber = policyNo;
 }

 @Override
 public double calculateRentalCost(int days) {
     return getRentalRate() * days;
 }

 @Override
 public double calculateInsurance() {
     return 200;
 }

 @Override
 public String getInsuranceDetails() {
     return "Bike Insurance";
 }
}
