package com.day9.budgetwise;

//Monthly budget class
public class MonthlyBudget extends Budget {

 // Constructor
 public MonthlyBudget(double income, double[] categoryLimits) {
     super(income, categoryLimits);
 }

 // Polymorphism
 public void generateReport() {
     System.out.println("Monthly Report");
     System.out.println("Savings: " + calculateSavings());
 }
}
