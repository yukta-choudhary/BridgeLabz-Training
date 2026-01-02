package com.encapsulation.hospitalmanagementsystem;

//Abstract class Patient
public abstract class Patient {

 // Encapsulated fields
 private int patientId;
 private String name;
 private int age;

 // Sensitive data
 private String diagnosis;

 // Constructor
 public Patient(int patientId, String name, int age) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
 }

 // Getters
 public int getPatientId() {
     return patientId;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 // Controlled access to diagnosis
 public void setDiagnosis(String diagnosis) {
     this.diagnosis = diagnosis;
 }

 protected String getDiagnosis() {
     return diagnosis;
 }

 // Abstract method
 public abstract double calculateBill();

 // Concrete method
 public void getPatientDetails() {
     System.out.println("Patient ID: " + patientId);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}
