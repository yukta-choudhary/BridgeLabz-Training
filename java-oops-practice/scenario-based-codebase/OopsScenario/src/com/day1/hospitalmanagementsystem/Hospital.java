package com.day1.hospitalmanagementsystem;

//Main class
public class Hospital {

	 public static void main(String[] args) {
	
	     // Create objects
	     Patient p1 = new Patient(1, "Amit", "Fever");
	     Doctor d1 = new Doctor(101, "Dr. Sharma", "Physician");
	
	     // Perform actions
	     p1.admit();
	     p1.showDetails();
	
	     d1.diagnose();
	     d1.showDetails();
	 }
}

