/*
	342. Power of Four

	Given an integer n, return true if it is a power of four.
	Otherwise, return false.

	An integer n is a power of four if n = 4^x for some integer x.
*/

import java.util.Scanner;

public class PowerOfFour {

    // Method to check power of four
    public static boolean isPowerOfFour(int n) {

        // Zero or negative numbers are not power of four
        if (n <= 0) {
            return false;
        }

        // Keep dividing by 4
        while (n % 4 == 0) {
            n = n / 4;
        }

        // If result becomes 1, it is power of four
        return n == 1;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Print result
        System.out.println(isPowerOfFour(n));
    }
}
