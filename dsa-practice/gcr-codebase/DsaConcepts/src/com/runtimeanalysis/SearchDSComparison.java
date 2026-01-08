package com.runtimeanalysis;



import java.util.*;

public class SearchDSComparison
{
    public static void main(String[] args)
    {
        int n = 100000;
        int target = n - 1;

        int[] arr = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < n; i++)
        {
            arr[i] = i;
            hs.add(i);
            ts.add(i);
        }

        long s1 = System.nanoTime();
        for (int x : arr)
            if (x == target) break;   // O(N)
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        hs.contains(target);          // O(1)
        long e2 = System.nanoTime();

        long s3 = System.nanoTime();
        ts.contains(target);          // O(log N)
        long e3 = System.nanoTime();

        System.out.println("Array: " + (e1 - s1));
        System.out.println("HashSet: " + (e2 - s2));
        System.out.println("TreeSet: " + (e3 - s3));
    }
}

