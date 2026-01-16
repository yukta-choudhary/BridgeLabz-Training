package com.day5.cropmonitor;

//SensorSorter.java
//This class contains Quick Sort logic

class SensorSorter {

 // Method to perform quick sort
 static void quickSort(int[] arr, int low, int high) {

     if (low < high) {
         int p = partition(arr, low, high); // get pivot index

         // sort left part
         quickSort(arr, low, p - 1);

         // sort right part
         quickSort(arr, p + 1, high);
     }
 }

 // Method to place pivot at correct position
 static int partition(int[] arr, int low, int high) {

     int pivot = arr[high]; // choose last element as pivot
     int i = low - 1;

     for (int j = low; j < high; j++) {

         // if current value is smaller than pivot
         if (arr[j] < pivot) {
             i++;

             // swap arr[i] and arr[j]
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     // place pivot in correct position
     int temp = arr[i + 1];
     arr[i + 1] = arr[high];
     arr[high] = temp;

     return i + 1;
 }

 // Method to display sorted data
 static void display(int[] arr, int n) {
     for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
     }
 }
}
