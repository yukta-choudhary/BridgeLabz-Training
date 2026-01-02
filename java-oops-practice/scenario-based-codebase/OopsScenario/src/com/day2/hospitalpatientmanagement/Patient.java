package com.day2.hospitalpatientmanagement;

//Patient
public class Patient {
 protected int patientId;
 protected String name;
 protected int age;
 private String medicalHistory;   // sensitive data (private)

 // Normal admission constructor
 public Patient(int patientId, String name, int age) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
     this.medicalHistory = "Not Provided";
 }

 // Emergency admission constructor (overloaded)
 public Patient(int patientId, String name, int age, String medicalHistory) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
     this.medicalHistory = medicalHistory;
 }

 // Getter (controlled access)
 public String getMedicalHistory() {
     return medicalHistory;
 }

 // Polymorphism
 public void displayInfo() {
     System.out.println("Patient Name: " + name);
 }

 // Public method to expose summary
 public void getSummary() {
     System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
 }
}
