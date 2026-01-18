package com.day6.fleetmanager;

//Merge sort vehicles by mileage

import java.util.Scanner;

public class FleetManager {

 // Merge function
 static void merge(Vehicle[] arr, int l, int m, int r) {

     int n1 = m - l + 1;
     int n2 = r - m;

     Vehicle[] L = new Vehicle[n1];
     Vehicle[] R = new Vehicle[n2];

     for (int i = 0; i < n1; i++)
         L[i] = arr[l + i];

     for (int j = 0; j < n2; j++)
         R[j] = arr[m + 1 + j];

     int i = 0, j = 0, k = l;

     while (i < n1 && j < n2) {
         if (L[i].mileage <= R[j].mileage) {
             arr[k] = L[i];
             i++;
         } else {
             arr[k] = R[j];
             j++;
         }
         k++;
     }

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

 // Merge sort
 static void mergeSort(Vehicle[] arr, int l, int r) {
     if (l < r) {
         int m = (l + r) / 2;

         mergeSort(arr, l, m);
         mergeSort(arr, m + 1, r);
         merge(arr, l, m, r);
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of vehicles: ");
     int n = sc.nextInt();

     Vehicle[] vehicles = new Vehicle[n];

     for (int i = 0; i < n; i++) {
         System.out.print("Enter vehicle id: ");
         String id = sc.next();
         System.out.print("Enter mileage: ");
         int mileage = sc.nextInt();

         vehicles[i] = new Vehicle(id, mileage);
     }

     mergeSort(vehicles, 0, n - 1);

     System.out.println("\nMaintenance Schedule (Sorted by Mileage):");
     for (int i = 0; i < n; i++) {
         System.out.println(vehicles[i].id + " - " + vehicles[i].mileage);
     }

     sc.close();
 }
}
