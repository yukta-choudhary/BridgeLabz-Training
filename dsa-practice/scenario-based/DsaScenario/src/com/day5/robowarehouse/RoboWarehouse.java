package com.day5.robowarehouse;

//RoboWarehouse.java
//Main class for Shelf Loading Robot

import java.util.Scanner;

class RoboWarehouse {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // take number of packages
     System.out.print("Enter number of packages: ");
     int n = sc.nextInt();

     int[] weights = new int[n];

     // take package weights
     System.out.println("Enter package weights:");
     for (int i = 0; i < n; i++) {
         weights[i] = sc.nextInt();
     }

     // sort weights using insertion sort
     ShelfSorter.insertionSort(weights, n);

     // display sorted shelf order
     System.out.println("Packages arranged in ascending order:");
     ShelfSorter.display(weights, n);

     sc.close();
 }
}
