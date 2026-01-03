package com.stacksandqueues.stockspanproblem;

import java.util.Scanner;

//Main class
public class UseStockSpan {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of days: ");
     int n = sc.nextInt();

     int[] price = new int[n];

     // Take stock prices input
     for (int i = 0; i < n; i++) {
         System.out.print("Enter price for day " + (i + 1) + ": ");
         price[i] = sc.nextInt();
     }

     // Calculate stock span
     int[] span = StockSpan.calculateSpan(price);

     System.out.println("Stock Span values:");

     // Print span
     for (int i = 0; i < n; i++) {
         System.out.println(span[i]);
     }

     sc.close();
 }
}
