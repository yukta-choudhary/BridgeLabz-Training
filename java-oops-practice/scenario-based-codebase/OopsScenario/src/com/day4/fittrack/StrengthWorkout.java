package com.day4.fittrack;

//Strength workout
public class StrengthWorkout extends Workout {

 StrengthWorkout(int duration) {
     super("Strength", duration);
 }

 // Polymorphism
 int calculateCalories() {
     caloriesBurned = duration * 6;
     return caloriesBurned;
 }
}
