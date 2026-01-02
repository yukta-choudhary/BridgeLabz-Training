package com.day2.hospitalpatientmanagement;

//OutPatient
public class OutPatient extends Patient {

 public OutPatient(int id, String name, int age) {
     super(id, name, age);
 }

 @Override
 public void displayInfo() {
     System.out.println("Out-Patient: " + name);
 }
}
