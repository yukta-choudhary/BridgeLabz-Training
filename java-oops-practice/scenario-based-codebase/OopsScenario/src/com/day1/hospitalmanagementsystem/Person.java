package com.day1.hospitalmanagementsystem;

//Parent class
public class Person {

	 protected int id;
	 protected String name;
	
	 // Constructor
	 Person(int id, String name) {
	     this.id = id;
	     this.name = name;
	 }
	
	 // Method to show details (will be overridden)
	 void showDetails() {
	     System.out.println("ID: " + id);
	     System.out.println("Name: " + name);
	 }
}
