package com.day1.hospitalmanagementsystem;
//Doctor class
public class Doctor extends Person {

	 private String specialization;
	
	 // Constructor
	 Doctor(int id, String name, String spec) {
	     super(id, name);
	     specialization = spec;
	 }
	
	 // Doctor action
	 public void diagnose() {
	     System.out.println("Doctor is diagnosing patient");
	 }
	
	 // Override method (Polymorphism)
	 void showDetails() {
	     super.showDetails();
	     System.out.println("Specialization: " + specialization);
	 }
}
