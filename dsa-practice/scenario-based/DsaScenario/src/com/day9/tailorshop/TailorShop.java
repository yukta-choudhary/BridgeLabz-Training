package com.day9.tailorshop;

import java.util.Scanner;

class TailorShop {

 // Method to perform Insertion Sort
 static void insertionSort(int arr[], int n) {
     for (int i = 1; i < n; i++) {
         int key = arr[i];      // current deadline
         int j = i - 1;

         // shift larger deadlines to right
         while (j >= 0 && arr[j] > key) {
             arr[j + 1] = arr[j];
             j--;
         }

         // insert at correct position
         arr[j + 1] = key;
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of orders: ");
     int n = sc.nextInt();

     int deadlines[] = new int[n];

     System.out.println("Enter delivery deadlines (in days):");
     for (int i = 0; i < n; i++) {
         deadlines[i] = sc.nextInt();
     }

     // sorting deadlines
     insertionSort(deadlines, n);

     System.out.println("Sorted orders by delivery deadline:");
     for (int i = 0; i < n; i++) {
         System.out.print(deadlines[i] + " ");
     }
 }
}
