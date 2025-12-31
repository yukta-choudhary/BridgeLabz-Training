/*
	326. Power of Three

	Given an integer n, return true if it is a power of three.
	Otherwise, return false.

	An integer n is a power of three if n = 3^x for some integer x.
*/

import java.util.Scanner;

public class PowerOfThree {

    // Method to check power of three
    public static boolean isPowerOfThree(int n) {

        // Zero or negative numbers are not power of three
        if (n <= 0) {
            return false;
        }

        // Keep dividing by 3
        while (n % 3 == 0) {
            n = n / 3;
        }

        // If result becomes 1, it is power of three
        return n == 1;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Print result
        System.out.println(isPowerOfThree(n));
    }
}
