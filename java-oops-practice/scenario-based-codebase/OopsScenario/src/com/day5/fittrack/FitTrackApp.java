package com.day5.fittrack;

//Main class
import java.util.Scanner;

public class FitTrackApp {

 // Question:
 // Implement FitTrack fitness tracker using OOP concepts

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // User input
     System.out.print("Enter name: ");
     String name = sc.nextLine();

     System.out.print("Enter age: ");
     int age = sc.nextInt();

     System.out.print("Enter weight: ");
     double weight = sc.nextDouble();
     sc.nextLine();

     System.out.print("Enter goal: ");
     String goal = sc.nextLine();

     UserProfile user = new UserProfile(name, age, weight, goal);

     // Workout choice
     System.out.print("Workout type (cardio/strength): ");
     String wType = sc.nextLine();

     System.out.print("Duration (minutes): ");
     int duration = sc.nextInt();

     Workout w;
     if (wType.equals("cardio")) {
         w = new CardioWorkout(duration);
     } else {
         w = new StrengthWorkout(duration);
     }

     FitnessTracker ft = new FitnessTracker();

     ft.startWorkout();
     ft.caloriesBurned = w.calculateCalories();
     ft.stopWorkout();

     // Output
     System.out.println("Calories Burned: " + ft.caloriesBurned);
     System.out.println("Remaining Target: " + ft.getProgress());

     sc.close();
 }
}
