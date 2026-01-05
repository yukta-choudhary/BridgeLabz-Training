package com.sorting.insertionsort;

/*
Problem:
Sort employee IDs using Insertion Sort in ascending order.
*/

import java.util.Scanner;

public class InsertionSortEmployee {

    // Method to perform insertion sort
    public static void insertionSort(int[] ids) {

        int n = ids.length;

        // Loop starts from second element
        for (int i = 1; i < n; i++) {

            int key = ids[i];      // current element
            int j = i - 1;

            // Shift elements to the right
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Insert key at correct position
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        int[] ids = new int[n];

        // Input employee IDs
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee ID " + (i + 1) + ":");
            ids[i] = sc.nextInt();
        }

        // Sorting IDs
        insertionSort(ids);

        // Display sorted IDs
        System.out.println("Sorted Employee IDs (Ascending):");
        for (int i = 0; i < n; i++) {
            System.out.print(ids[i] + " ");
        }

        sc.close();
    }
}
