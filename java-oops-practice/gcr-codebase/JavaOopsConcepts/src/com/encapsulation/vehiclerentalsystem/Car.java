package com.encapsulation.vehiclerentalsystem;
//Car class
public class Car extends Vehicle implements Insurable {

 // Sensitive data
 private String insurancePolicyNumber;

 public Car(String number, double rate, String policyNo) {
     super(number, "Car", rate);
     this.insurancePolicyNumber = policyNo;
 }

 @Override
 public double calculateRentalCost(int days) {
     return getRentalRate() * days;
 }

 @Override
 public double calculateInsurance() {
     return 500; // fixed insurance
 }

 @Override
 public String getInsuranceDetails() {
     return "Car Insurance";
 }
}

