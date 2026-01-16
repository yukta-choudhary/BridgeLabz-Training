package com.generics.mealplangenerator;

import java.util.Scanner;

//Question: Personalized Meal Plan Generator using Generics

public class MealPlanner {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Choose Meal Type:");
     System.out.println("1. Vegetarian");
     System.out.println("2. Vegan");
     System.out.println("3. Keto");
     System.out.println("4. High Protein");

     int choice = sc.nextInt();

     System.out.println();

     // Generate meal based on choice
     switch (choice) {

         case 1:
             MealUtility.generateMeal(new VegetarianMeal());
             break;

         case 2:
             MealUtility.generateMeal(new VeganMeal());
             break;

         case 3:
             MealUtility.generateMeal(new KetoMeal());
             break;

         case 4:
             MealUtility.generateMeal(new HighProteinMeal());
             break;

         default:
             System.out.println("Invalid choice");
     }

     sc.close();
 }
}

