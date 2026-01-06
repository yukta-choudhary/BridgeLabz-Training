package com.day5.fittrack;

//Cardio workout
public class CardioWorkout extends Workout {

 CardioWorkout(int duration) {
     super("Cardio", duration);
 }

 // Polymorphism
 int calculateCalories() {
     caloriesBurned = duration * 8;
     return caloriesBurned;
 }
}
