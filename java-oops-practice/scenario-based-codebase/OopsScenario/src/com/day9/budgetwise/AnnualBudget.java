package com.day9.budgetwise;

//Annual budget class
public class AnnualBudget extends Budget {

 // Constructor
 public AnnualBudget(double income, double[] categoryLimits) {
     super(income, categoryLimits);
 }

 // Polymorphism
 public void generateReport() {
     System.out.println("Annual Report");
     System.out.println("Yearly Savings: " + calculateSavings());
 }
}

