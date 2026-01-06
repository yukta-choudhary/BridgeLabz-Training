package com.day4.fittrack;

//Base workout class
public class Workout {

 String type;
 int duration; // in minutes
 protected int caloriesBurned;

 // Constructor
 Workout(String type, int duration) {
     this.type = type;
     this.duration = duration;
 }

 // Method to calculate calories
 int calculateCalories() {
     return 0; // overridden in child classes
 }
}
