package com.day7.flashdealz;

import java.util.Scanner;

class EduResults {

 // Merge Sort method
 static void mergeSort(int[] a, int low, int high) {
     if (low < high) {
         int mid = (low + high) / 2;
         mergeSort(a, low, mid);
         mergeSort(a, mid + 1, high);
         merge(a, low, mid, high);
     }
 }

 // Merge two sorted parts
 static void merge(int[] a, int low, int mid, int high) {
     int[] temp = new int[high - low + 1];
     int i = low, j = mid + 1, k = 0;

     // Merge in descending order (rank list)
     while (i <= mid && j <= high) {
         if (a[i] >= a[j]) {   // stable for same marks
             temp[k++] = a[i++];
         } else {
             temp[k++] = a[j++];
         }
     }

     while (i <= mid) {
         temp[k++] = a[i++];
     }

     while (j <= high) {
         temp[k++] = a[j++];
     }

     // Copy back
     for (int x = 0; x < temp.length; x++) {
         a[low + x] = temp[x];
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of students: ");
     int n = sc.nextInt();

     int[] marks = new int[n];

     // Input marks
     for (int i = 0; i < n; i++) {
         System.out.print("Enter marks of student " + (i + 1) + ": ");
         marks[i] = sc.nextInt();
     }

     // Apply Merge Sort
     mergeSort(marks, 0, n - 1);

     // Display rank sheet
     System.out.println("\nState-wise Rank List:");
     for (int i = 0; i < n; i++) {
         System.out.println("Rank " + (i + 1) + ": " + marks[i]);
     }

     sc.close();
 }
}
