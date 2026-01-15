package com.day9.budgetwise;
//Base Budget class
public class Budget implements IAnalyzable {

 protected double income;
 protected double totalExpenses;
 protected double[] categoryLimits;

 // Constructor
 public Budget(double income, double[] categoryLimits) {
     this.income = income;
     this.categoryLimits = categoryLimits;
     this.totalExpenses = 0;
 }

 // Add expense (restricted editing)
 public void addExpense(double amount) {
     totalExpenses = totalExpenses + amount; // operator usage
 }

 // Calculate savings
 public double calculateSavings() {
     return income - totalExpenses;
 }

 // Report (will be overridden)
 public void generateReport() {
     System.out.println("Budget Report");
 }

 // Overspend check
 public void detectOverspend() {
     if (totalExpenses > income) {
         System.out.println("Overspending detected!");
     } else {
         System.out.println("Spending is under control");
     }
 }
}
