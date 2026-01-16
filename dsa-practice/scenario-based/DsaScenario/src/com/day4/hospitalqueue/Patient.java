package com.day4.hospitalqueue;

//Patient class
public class Patient {
 int id;
 String name;
 int criticality; // 1 (low) to 10 (high)

 // Constructor
 public Patient(int id, String name, int criticality) {
     this.id = id;
     this.name = name;
     this.criticality = criticality;
 }

 // Display details
 void display() {
     System.out.println(id + "  " + name + "  Criticality: " + criticality);
 }
}
