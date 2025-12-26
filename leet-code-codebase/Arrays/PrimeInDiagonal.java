/* 
2614. Prime In Diagonal

You are given a 2D array nums.
Return the largest prime number present on either of the diagonals.
If no prime number is found, return 0.

A number is on the diagonal if:
- nums[i][i]
- nums[i][n - i - 1]
*/

import java.util.Scanner;

public class PrimeInDiagonal {

    // Method to check prime number
    static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to find largest prime on diagonals
    static int diagonalPrime(int[][] nums) {

        int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {

            // Primary diagonal
            int val1 = nums[i][i];
            if (isPrime(val1) && val1 > maxPrime) {
                maxPrime = val1;
            }

            // Secondary diagonal
            int val2 = nums[i][n - i - 1];
            if (isPrime(val2) && val2 > maxPrime) {
                maxPrime = val2;
            }
        }

        return maxPrime;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Matrix size
        System.out.print("Enter matrix size: ");
        int n = input.nextInt();

        int[][] nums = new int[n][n];

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = input.nextInt();
            }
        }

        // Call method
        int result = diagonalPrime(nums);

        // Output
        System.out.println("Largest prime on diagonal: " + result);

        input.close();
    }
}
