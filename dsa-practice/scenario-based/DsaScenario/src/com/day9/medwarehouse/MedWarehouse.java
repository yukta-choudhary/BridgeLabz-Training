package com.day9.medwarehouse;

import java.util.Scanner;

class MedWarehouse {

 // Method to merge two sub arrays
 static void merge(int arr[], int left, int mid, int right) {

     int n1 = mid - left + 1;
     int n2 = right - mid;

     int L[] = new int[n1];
     int R[] = new int[n2];

     // copy data
     for (int i = 0; i < n1; i++)
         L[i] = arr[left + i];

     for (int j = 0; j < n2; j++)
         R[j] = arr[mid + 1 + j];

     int i = 0, j = 0, k = left;

     // merge arrays
     while (i < n1 && j < n2) {
         if (L[i] <= R[j]) {
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

 // Method to perform Merge Sort
 static void mergeSort(int arr[], int left, int right) {
     if (left < right) {

         int mid = (left + right) / 2;

         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);

         merge(arr, left, mid, right);
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of medicines: ");
     int n = sc.nextInt();

     int expiry[] = new int[n];

     System.out.println("Enter expiry dates (days remaining):");
     for (int i = 0; i < n; i++) {
         expiry[i] = sc.nextInt();
     }

     // sorting expiry dates
     mergeSort(expiry, 0, n - 1);

     System.out.println("Sorted medicines by expiry date:");
     for (int i = 0; i < n; i++) {
         System.out.print(expiry[i] + " ");
     }
 }
}
