package com.runtimeanalysis;
/*
Problem 5: Fibonacci Comparison
*/

public class FibonacciComparison
{
    // Recursive - O(2^N)
    static int fibRec(int n)
    {
        if (n <= 1)
            return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    // Iterative - O(N)
    static int fibIter(int n)
    {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++)
        {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args)
    {
        int n = 30;

        long s1 = System.nanoTime();
        fibRec(n);
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        fibIter(n);
        long e2 = System.nanoTime();

        System.out.println("Recursive: " + (e1 - s1));
        System.out.println("Iterative: " + (e2 - s2));
    }
}
