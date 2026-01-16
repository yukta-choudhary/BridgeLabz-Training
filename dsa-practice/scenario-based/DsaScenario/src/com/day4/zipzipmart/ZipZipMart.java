package com.day4.zipzipmart;

import java.util.Scanner;

public class ZipZipMart {

    // Merge two sorted halves
    static void merge(Transaction[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge while sorting by date, then amount
        while (i < n1 && j < n2) {
            if (L[i].date.compareTo(R[j].date) < 0 ||
               (L[i].date.equals(R[j].date) && L[i].amount <= R[j].amount)) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
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

    // Merge Sort
    static void mergeSort(Transaction[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Divide
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Conquer
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine();

        Transaction[] transactions = new Transaction[n];

        // Input transactions
        for (int i = 0; i < n; i++) {
            System.out.println("\nTransaction " + (i + 1));
            System.out.print("Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Amount: ");
            int amount = sc.nextInt();
            sc.nextLine();

            transactions[i] = new Transaction(date, amount);
        }

        // Sort transactions
        mergeSort(transactions, 0, n - 1);

        System.out.println("\nSorted Daily Sales Report:");
        for (int i = 0; i < n; i++) {
            transactions[i].display();
        }

        sc.close();
    }
}

