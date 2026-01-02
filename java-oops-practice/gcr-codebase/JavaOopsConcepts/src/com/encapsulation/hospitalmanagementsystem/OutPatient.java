package com.encapsulation.hospitalmanagementsystem;
//Out-patient class
public class OutPatient extends Patient implements MedicalRecord {

 private double consultationFee;
 private String medicalHistory;

 public OutPatient(int id, String name, int age, double fee) {
     super(id, name, age);
     this.consultationFee = fee;
 }

 // Fixed consultation fee
 @Override
 public double calculateBill() {
     return consultationFee;
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
