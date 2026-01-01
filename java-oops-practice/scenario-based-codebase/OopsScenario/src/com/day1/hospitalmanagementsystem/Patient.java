package com.day1.hospitalmanagementsystem;

//Patient class
public class Patient extends Person {
	
	 private String disease;
	 private boolean admitted;
	
	 // Constructor
	 Patient(int id, String name, String disease) {
	     super(id, name);
	     this.disease = disease;
	     admitted = false;
	 }
	
	 // Admit patient
	 public void admit() {
	     admitted = true;
	     System.out.println("Patient admitted");
	 }
	
	 // Discharge patient
	 public void discharge() {
	     admitted = false;
	     System.out.println("Patient discharged");
	 }
	
	 // Override method (Polymorphism)
	 void showDetails() {
	     super.showDetails();
	     System.out.println("Disease: " + disease);
	     System.out.println("Admitted: " + admitted);
	 }
}
