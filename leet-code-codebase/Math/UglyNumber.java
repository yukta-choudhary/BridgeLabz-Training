/*
	263. Ugly Number

	An ugly number is a positive integer which does not have
	a prime factor other than 2, 3, and 5.

	Return true if the given number is an ugly number.
*/

import java.util.Scanner;

public class UglyNumber {

    // Method to check ugly number
    public static boolean isUgly(int n) {

        // Negative numbers are not ugly
        if (n <= 0) {
            return false;
        }

        // Divide by 2 as long as possible
        while (n % 2 == 0) {
            n = n / 2;
        }

        // Divide by 3 as long as possible
        while (n % 3 == 0) {
            n = n / 3;
        }

        // Divide by 5 as long as possible
        while (n % 5 == 0) {
            n = n / 5;
        }

        // If reduced to 1, it is ugly
        return n == 1;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Check and print result
        System.out.println(isUgly(n));
    }
}
