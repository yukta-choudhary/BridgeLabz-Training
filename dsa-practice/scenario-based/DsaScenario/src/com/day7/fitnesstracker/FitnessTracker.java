package com.day7.fitnesstracker;

import java.util.Scanner;

class FitnessTracker {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of users: ");
     int n = sc.nextInt();

     int[] steps = new int[n];

     // Taking input
     for (int i = 0; i < n; i++) {
         System.out.print("Enter steps for user " + (i + 1) + ": ");
         steps[i] = sc.nextInt();
     }

     // Bubble Sort (Descending Order)
     for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - 1 - i; j++) {
             if (steps[j] < steps[j + 1]) {
                 int temp = steps[j];
                 steps[j] = steps[j + 1];
                 steps[j + 1] = temp;
             }
         }
     }

     // Display ranking
     System.out.println("\nDaily Step Ranking:");
     for (int i = 0; i < n; i++) {
         System.out.println("Rank " + (i + 1) + ": " + steps[i] + " steps");
     }

     sc.close();
 }
}

