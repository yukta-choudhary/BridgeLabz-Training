package com.sorting.selectionsort;


import java.util.Scanner;

public class SelectionSortScores {

 // Selection Sort method
 static void selectionSort(int[] arr) {

     int n = arr.length;

     // Move boundary of unsorted part
     for (int i = 0; i < n - 1; i++) {

         int min = i;

         // Find minimum element
         for (int j = i + 1; j < n; j++) {
             if (arr[j] < arr[min]) {
                 min = j;
             }
         }

         // Swap if needed
         int temp = arr[min];
         arr[min] = arr[i];
         arr[i] = temp;
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input size
     System.out.print("Enter number of students: ");
     int n = sc.nextInt();

     int[] marks = new int[n];

     // Input exam scores
     System.out.println("Enter exam scores:");
     for (int i = 0; i < n; i++) {
         marks[i] = sc.nextInt();
     }

     // Apply Selection Sort
     selectionSort(marks);

     // Output sorted scores
     System.out.println("Sorted exam scores:");
     for (int i = 0; i < n; i++) {
         System.out.print(marks[i] + " ");
     }

     sc.close();
 }
}
