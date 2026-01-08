package com.runtimeanalysis;


import java.util.Arrays;

public class SortingComparison
{
    // Bubble Sort - O(N^2)
    static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort - O(N log N)
    static void mergeSort(int[] arr)
    {
        Arrays.sort(arr); // optimized merge/tim sort
    }

    // Quick Sort - O(N log N)
    static void quickSort(int[] arr)
    {
        Arrays.sort(arr);
    }

    public static void main(String[] args)
    {
        int n = 10000;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr1[i] = arr2[i] = arr3[i] = n - i;
        }

        long s1 = System.nanoTime();
        bubbleSort(arr1);
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        mergeSort(arr2);
        long e2 = System.nanoTime();

        long s3 = System.nanoTime();
        quickSort(arr3);
        long e3 = System.nanoTime();

        System.out.println("Bubble Sort: " + (e1 - s1));
        System.out.println("Merge Sort: " + (e2 - s2));
        System.out.println("Quick Sort: " + (e3 - s3));
    }
}
