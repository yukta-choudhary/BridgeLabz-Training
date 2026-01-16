package com.generics.mealplangenerator;

//Utility class for generic methods

class MealUtility {

 // Generic method with bounded type
 static <T extends MealPlan> void generateMeal(T meal) {
     System.out.println("Your Personalized Meal Plan:");
     meal.showMeal();
 }
}

