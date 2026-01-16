package com.day4.examcell;

/*
Merge Sort logic for student score sorting
*/

class MergeSort {

    // merge sort method
    static void sort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            sort(arr, low, mid);       // left part
            sort(arr, mid + 1, high);  // right part
            merge(arr, low, mid, high);
        }
    }

    // merge two sorted parts
    static void merge(int arr[], int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        // copy left part
        for (int i = 0; i < n1; i++)
            left[i] = arr[low + i];

        // copy right part
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = low;

        // merge arrays
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining left
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // copy remaining right
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}

