package com.sorting.countingsort;

import java.util.Scanner;

public class CountingSortAges {

 // Counting Sort method
 static void countingSort(int[] arr) {

     int n = arr.length;
     int minAge = 10;
     int maxAge = 18;

     int range = maxAge - minAge + 1;

     int[] count = new int[range];
     int[] output = new int[n];

     // Count frequency of each age
     for (int i = 0; i < n; i++) {
         count[arr[i] - minAge]++;
     }

     // Cumulative count
     for (int i = 1; i < range; i++) {
         count[i] = count[i] + count[i - 1];
     }

     // Build output array
     for (int i = n - 1; i >= 0; i--) {
         output[count[arr[i] - minAge] - 1] = arr[i];
         count[arr[i] - minAge]--;
     }

     // Copy output to original array
     for (int i = 0; i < n; i++) {
         arr[i] = output[i];
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input size
     System.out.print("Enter number of students: ");
     int n = sc.nextInt();

     int[] age = new int[n];

     // Input ages
     System.out.println("Enter student ages (10 to 18):");
     for (int i = 0; i < n; i++) {
         age[i] = sc.nextInt();
     }

     // Apply Counting Sort
     countingSort(age);

     // Output sorted ages
     System.out.println("Sorted student ages:");
     for (int i = 0; i < n; i++) {
         System.out.print(age[i] + " ");
     }

     sc.close();
 }
}

