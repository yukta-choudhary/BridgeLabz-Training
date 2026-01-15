package com.day9.budgetwise;

//Main class
import java.util.Scanner;

public class BudgetWiseApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input income
     System.out.print("Enter Income: ");
     double income = sc.nextDouble();

     // Category limits
     double[] limits = new double[3];
     System.out.println("Enter 3 category limits:");
     for (int i = 0; i < 3; i++) {
         limits[i] = sc.nextDouble();
     }

     // Monthly budget object
     Budget month = new MonthlyBudget(income, limits);

     // Add expenses
     System.out.print("Enter expense amount: ");
     double exp = sc.nextDouble();
     month.addExpense(exp);

     // Polymorphic calls
     month.generateReport();
     month.detectOverspend();

     sc.close();
 }
}
