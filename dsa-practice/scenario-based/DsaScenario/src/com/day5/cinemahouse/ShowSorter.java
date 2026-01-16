package com.day5.cinemahouse;

//ShowSorter.java
//This class contains Bubble Sort logic

class ShowSorter {

 // Method to sort show times using bubble sort
 static void bubbleSort(int[] arr, int n) {

     for (int i = 0; i < n - 1; i++) {

         // compare adjacent show times
         for (int j = 0; j < n - 1 - i; j++) {

             // swap if order is wrong
             if (arr[j] > arr[j + 1]) {
                 int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
             }
         }
     }
 }

 // Method to display show times
 static void display(int[] arr, int n) {
     for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
     }
 }
}

