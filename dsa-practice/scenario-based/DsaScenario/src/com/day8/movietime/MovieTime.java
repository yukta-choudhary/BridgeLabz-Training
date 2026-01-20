package com.day8.movietime;



import java.util.Scanner;

class MovieTime {

   // Method to perform insertion sort
   static void insertionSort(int arr[], int n) {
       int i, j, key;

       for (i = 1; i < n; i++) {
           key = arr[i];      // current show time
           j = i - 1;

           // shift bigger elements to right
           while (j >= 0 && arr[j] > key) {
               arr[j + 1] = arr[j];
               j--;
           }

           arr[j + 1] = key;  // insert at correct position
       }
   }

   // Method to display show times
   static void display(int arr[], int n) {
       System.out.println("Sorted Show Timings:");
       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
       }
   }

   // Main method
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number of shows: ");
       int n = sc.nextInt();

       int showTimes[] = new int[n];

       // taking input
       System.out.println("Enter show timings (in 24-hr format):");
       for (int i = 0; i < n; i++) {
           showTimes[i] = sc.nextInt();
       }

       // sorting show timings
       insertionSort(showTimes, n);

       // displaying result
       display(showTimes, n);
   }
}
