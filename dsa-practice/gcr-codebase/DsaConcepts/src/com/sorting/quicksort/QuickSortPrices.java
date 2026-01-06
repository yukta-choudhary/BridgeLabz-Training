package com.sorting.quicksort;


import java.util.Scanner;

public class QuickSortPrices {

 // Quick Sort method
 static void quickSort(int[] arr, int low, int high) {

     if (low < high) {

         // Get pivot index
         int p = partition(arr, low, high);

         // Sort left part
         quickSort(arr, low, p - 1);

         // Sort right part
         quickSort(arr, p + 1, high);
     }
 }

 // Partition method
 static int partition(int[] arr, int low, int high) {

     int pivot = arr[high]; // last element as pivot
     int i = low - 1;

     for (int j = low; j < high; j++) {

         if (arr[j] < pivot) {
             i++;

             // swap arr[i] and arr[j]
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     // swap pivot to correct position
     int temp = arr[i + 1];
     arr[i + 1] = arr[high];
     arr[high] = temp;

     return i + 1;
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input size
     System.out.print("Enter number of products: ");
     int n = sc.nextInt();

     int[] prices = new int[n];

     // Input prices
     System.out.println("Enter product prices:");
     for (int i = 0; i < n; i++) {
         prices[i] = sc.nextInt();
     }

     // Apply Quick Sort
     quickSort(prices, 0, n - 1);

     // Output sorted prices
     System.out.println("Sorted product prices:");
     for (int i = 0; i < n; i++) {
         System.out.print(prices[i] + " ");
     }

     sc.close();
 }
}
