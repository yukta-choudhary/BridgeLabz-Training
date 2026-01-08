package com.runtimeanalysis;

import java.util.Arrays;
import java.util.Scanner;

public class SearchComparison
{
    // Linear Search - O(N)
    static int linearSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search - O(log N)
    static int binarySearch(int[] arr, int target)
    {
        int left = 0, right = arr.length - 1;

        while (left <= right)
        {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dataset size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Fill array with sorted data
        for (int i = 0; i < n; i++)
            arr[i] = i + 1;

        System.out.println("Enter target to search:");
        int target = sc.nextInt();

        // Linear Search timing
        long start1 = System.nanoTime();
        linearSearch(arr, target);
        long end1 = System.nanoTime();

        // Binary Search timing
        long start2 = System.nanoTime();
        binarySearch(arr, target);
        long end2 = System.nanoTime();

        System.out.println("Linear Search Time: " + (end1 - start1) + " ns");
        System.out.println("Binary Search Time: " + (end2 - start2) + " ns");

        sc.close();
    }
}
