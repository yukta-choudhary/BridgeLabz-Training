package com.day8.gamerzone;


import java.util.Scanner;

class GamerZone {

   // Method to swap two elements
   static void swap(int arr[], int i, int j) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }

   // Partition method
   static int partition(int arr[], int low, int high) {

       int pivot = arr[high];   // choose last element as pivot
       int i = low - 1;

       for (int j = low; j < high; j++) {
           if (arr[j] <= pivot) {
               i++;
               swap(arr, i, j);
           }
       }

       swap(arr, i + 1, high);  // place pivot correctly
       return i + 1;
   }

   // Quick Sort method
   static void quickSort(int arr[], int low, int high) {

       if (low < high) {
           int pi = partition(arr, low, high);

           quickSort(arr, low, pi - 1);   // left side
           quickSort(arr, pi + 1, high);  // right side
       }
   }

   // Display method
   static void display(int arr[], int n) {
       System.out.println("Leaderboard Scores (Sorted):");
       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
       }
   }

   // Main method
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number of players: ");
       int n = sc.nextInt();

       int scores[] = new int[n];

       System.out.println("Enter player scores:");
       for (int i = 0; i < n; i++) {
           scores[i] = sc.nextInt();
       }

       // apply quick sort
       quickSort(scores, 0, n - 1);

       // display leaderboard
       display(scores, n);
   }
}

