package com.day2.hospitalpatientmanagement;
//InPatient
public class InPatient extends Patient {
 private int daysAdmitted;

 public InPatient(int id, String name, int age, int daysAdmitted) {
     super(id, name, age);
     this.daysAdmitted = daysAdmitted;
 }

 @Override
 public void displayInfo() {
     System.out.println("In-Patient: " + name + ", Days Admitted: " + daysAdmitted);
 }
}
