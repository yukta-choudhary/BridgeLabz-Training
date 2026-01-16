package com.day4.eventmanager;

/*
Quick Sort logic for ticket price sorting
*/

class QuickSort {

    // quick sort method
    static void sort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
    }

    // partition logic
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];   // last element pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
