package com.generics.mealplangenerator;
//Generic Meal class
//T must implement MealPlan

class Meal<T extends MealPlan> {

 T plan;

 // Constructor
 Meal(T plan) {
     this.plan = plan;
 }

 // Show meal plan
 void displayMeal() {
     plan.showMeal();
 }
}

