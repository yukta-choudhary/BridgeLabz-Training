package com.day5.robowarehouse;

//ShelfSorter.java
//This class contains Insertion Sort logic

class ShelfSorter {

 // Method to perform insertion sort
 static void insertionSort(int[] arr, int n) {

     for (int i = 1; i < n; i++) {
         int key = arr[i];      // current package weight
         int j = i - 1;

         // shift heavier packages to the right
         while (j >= 0 && arr[j] > key) {
             arr[j + 1] = arr[j];
             j--;
         }

         // insert package at correct position
         arr[j + 1] = key;
     }
 }

 // Method to display array
 static void display(int[] arr, int n) {
     for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
     }
 }
}

