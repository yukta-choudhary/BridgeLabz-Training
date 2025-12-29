/*
204. Count Primes
Medium
Topics
premium lock icon
Companies
Hint
Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

0 <= n <= 5 * 106
*/

import java.util.Scanner;

public class CountPrimes {

    // Method to count prime numbers less than n
    public static int countPrimes(int n) {

        int count = 0;

        // Check each number from 2 to n-1
        for (int i = 2; i < n; i++) {

            boolean isPrime = true;

            // Check divisibility up to sqrt(i)
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input value
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Call method
        int result = countPrimes(n);

        // Output
        System.out.println("Number of prime numbers less than " + n + " is: " + result);

        input.close();
    }
}
