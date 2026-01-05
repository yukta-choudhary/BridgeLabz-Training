package com.sorting.mergesort;

/*
Problem:
Sort book prices using Merge Sort in ascending order.
*/

import java.util.Scanner;

public class MergeSortBookPrices {

    // Method to apply merge sort
    public static void mergeSort(int[] prices, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(prices, left, mid);

            // Sort right half
            mergeSort(prices, mid + 1, right);

            // Merge both halves
            merge(prices, left, mid, right);
        }
    }

    // Method to merge two sorted parts
    public static void merge(int[] prices, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = prices[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = prices[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge the arrays
        while (i < n1 && j < n2) {

            if (leftArr[i] <= rightArr[j]) {
                prices[k] = leftArr[i];
                i++;
            } else {
                prices[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.println("Enter number of books:");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input book prices
        for (int i = 0; i < n; i++) {
            System.out.println("Enter price of book " + (i + 1) + ":");
            prices[i] = sc.nextInt();
        }

        // Sort prices
        mergeSort(prices, 0, n - 1);

        // Display sorted prices
        System.out.println("Sorted Book Prices (Ascending):");
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }

        sc.close();
    }
}

