package com.day4.fittrack;

//User profile class
public class UserProfile {

 String name;
 int age;
 private double weight; // protected health data
 String goal;

 // Constructor with default goal
 UserProfile(String name, int age, double weight) {
     this.name = name;
     this.age = age;
     this.weight = weight;
     this.goal = "Stay Fit";
 }

 // Constructor with custom goal
 UserProfile(String name, int age, double weight, String goal) {
     this.name = name;
     this.age = age;
     this.weight = weight;
     this.goal = goal;
 }

 // Getter for weight
 double getWeight() {
     return weight;
 }
}

