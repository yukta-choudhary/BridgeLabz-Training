/*
	Power of Two

	Given an integer n, return true if it is a power of two.
	Otherwise, return false.

	An integer n is a power of two if there exists an integer x
	such that n == 2^x.

	Example 1:
	Input: n = 1
	Output: true

*/

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        boolean isPowerOfTwo = true;

        // Zero and negative numbers are not power of two
        if (n <= 0) {
            isPowerOfTwo = false;
        } else {

            // Divide the number by 2 until it becomes 1
            while (n > 1) {

                // If number is not divisible by 2
                if (n % 2 != 0) {
                    isPowerOfTwo = false;
                    break;
                }

                n = n / 2;
            }
        }

        // Display result
        if (isPowerOfTwo) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        input.close();
    }
}
