package com.sorting.heapsort;

import java.util.Scanner;

public class HeapSortSalary {

 // Heap Sort method
 static void heapSort(int[] arr) {

     int n = arr.length;

     // Build max heap
     for (int i = n / 2 - 1; i >= 0; i--) {
         heapify(arr, n, i);
     }

     // Extract elements from heap
     for (int i = n - 1; i > 0; i--) {

         // Swap root with last element
         int temp = arr[0];
         arr[0] = arr[i];
         arr[i] = temp;

         // Heapify reduced heap
         heapify(arr, i, 0);
     }
 }

 // Heapify method
 static void heapify(int[] arr, int n, int i) {

     int largest = i;
     int left = 2 * i + 1;
     int right = 2 * i + 2;

     // Check left child
     if (left < n && arr[left] > arr[largest]) {
         largest = left;
     }

     // Check right child
     if (right < n && arr[right] > arr[largest]) {
         largest = right;
     }

     // Swap and continue heapifying
     if (largest != i) {

         int temp = arr[i];
         arr[i] = arr[largest];
         arr[largest] = temp;

         heapify(arr, n, largest);
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input size
     System.out.print("Enter number of applicants: ");
     int n = sc.nextInt();

     int[] salary = new int[n];

     // Input salary demands
     System.out.println("Enter expected salaries:");
     for (int i = 0; i < n; i++) {
         salary[i] = sc.nextInt();
     }

     // Apply Heap Sort
     heapSort(salary);

     // Output sorted salaries
     System.out.println("Sorted salary demands:");
     for (int i = 0; i < n; i++) {
         System.out.print(salary[i] + " ");
     }

     sc.close();
 }
}
