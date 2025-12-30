/*
	507. Perfect Number

	A perfect number is a positive integer that is equal to the sum of its
	positive divisors, excluding the number itself.

	A divisor of an integer x is a number that divides x completely.

	Given an integer num, return true if it is a perfect number,
	otherwise return false.

	Example 1:
	Input: num = 28
	Output: true
	Explanation: 28 = 1 + 2 + 4 + 7 + 14

*/

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number from user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0;

        // Loop to find divisors
        for (int i = 1; i <= num / 2; i++) {

            // If i divides num completely
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        // Check if perfect number
        if (sum == num && num != 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        input.close();
    }
}
