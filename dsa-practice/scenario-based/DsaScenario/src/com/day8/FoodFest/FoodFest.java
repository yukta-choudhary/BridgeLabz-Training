package com.day8.FoodFest;


import java.util.Scanner;

class FoodFest {

   // Method to merge two sorted parts
   static void merge(int arr[], int left, int mid, int right) {

       int n1 = mid - left + 1;
       int n2 = right - mid;

       int L[] = new int[n1];
       int R[] = new int[n2];

       // copy data to temp arrays
       for (int i = 0; i < n1; i++)
           L[i] = arr[left + i];

       for (int j = 0; j < n2; j++)
           R[j] = arr[mid + 1 + j];

       int i = 0, j = 0, k = left;

       // merge arrays (stable)
       while (i < n1 && j < n2) {
           if (L[i] <= R[j]) {   // stability maintained
               arr[k] = L[i];
               i++;
           } else {
               arr[k] = R[j];
               j++;
           }
           k++;
       }

       // copy remaining elements
       while (i < n1) {
           arr[k] = L[i];
           i++;
           k++;
       }

       while (j < n2) {
           arr[k] = R[j];
           j++;
           k++;
       }
   }

   // Merge Sort method
   static void mergeSort(int arr[], int left, int right) {

       if (left < right) {
           int mid = (left + right) / 2;

           mergeSort(arr, left, mid);       // left part
           mergeSort(arr, mid + 1, right);  // right part

           merge(arr, left, mid, right);    // merge both
       }
   }

   // Display method
   static void display(int arr[], int n) {
       System.out.println("Sorted Footfall Data:");
       for (int i = 0; i < n; i++)
           System.out.print(arr[i] + " ");
   }

   // Main method
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter total number of stall records: ");
       int n = sc.nextInt();

       int footfall[] = new int[n];

       System.out.println("Enter footfall counts (zone-wise sorted):");
       for (int i = 0; i < n; i++) {
           footfall[i] = sc.nextInt();
       }

       // apply merge sort
       mergeSort(footfall, 0, n - 1);

       // display result
       display(footfall, n);
   }
}

