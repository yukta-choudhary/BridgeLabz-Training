package com.encapsulation.hospitalmanagementsystem;

//In-patient class
public class InPatient extends Patient implements MedicalRecord {

 private int daysAdmitted;
 private double dailyCharge;
 private String medicalHistory;

 public InPatient(int id, String name, int age, int days, double charge) {
     super(id, name, age);
     this.daysAdmitted = days;
     this.dailyCharge = charge;
 }

 // Bill based on number of days
 @Override
 public double calculateBill() {
     return daysAdmitted * dailyCharge;
 }

 @Override
 public void addRecord(String record) {
     medicalHistory = record;
 }

 @Override
 public void viewRecords() {
     System.out.println("Medical History: " + medicalHistory);
 }
}
