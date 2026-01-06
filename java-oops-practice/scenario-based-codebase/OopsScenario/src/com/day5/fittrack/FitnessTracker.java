package com.day5.fittrack;

//Fitness tracker class
public class FitnessTracker implements ITrackable {

 private int dailyTarget = 500; // private log
 int caloriesBurned;

 public void startWorkout() {
     System.out.println("Workout Started");
 }

 public void stopWorkout() {
     System.out.println("Workout Stopped");
 }

 // Progress calculation
 int getProgress() {
     return dailyTarget - caloriesBurned;
 }
}
