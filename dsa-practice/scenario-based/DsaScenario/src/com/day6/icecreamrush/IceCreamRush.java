package com.day6.icecreamrush;

//Bubble Sort to sort flavors by popularity

import java.util.Scanner;

public class IceCreamRush {

 // Bubble sort
 static void bubbleSort(Flavour[] arr, int n) {

     for (int i = 0; i < n - 1; i++) {

         for (int j = 0; j < n - 1 - i; j++) {

             if (arr[j].sold > arr[j + 1].sold) {
                 Flavour temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
             }
         }
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of flavors: ");
     int n = sc.nextInt();

     Flavour[] flavors = new Flavour[n];

     for (int i = 0; i < n; i++) {
         System.out.print("Enter flavor name: ");
         String name = sc.next();
         System.out.print("Enter sold count: ");
         int sold = sc.nextInt();

         flavors[i] = new Flavour(name, sold);
     }

     bubbleSort(flavors, n);

     System.out.println("\nFlavors sorted by popularity:");
     for (int i = 0; i < n; i++) {
         System.out.println(flavors[i].name + " - " + flavors[i].sold);
     }

     sc.close();
 }
}
