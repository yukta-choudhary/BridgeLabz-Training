/*
	67. Add Binary

	Given two binary strings a and b, return their sum as a binary string.

	Example 1:
	Input: a = "11", b = "1"
	Output: "100"

	Example 2:
	Input: a = "1010", b = "1011"
	Output: "10101"
*/

import java.util.Scanner;

public class AddBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take binary strings from user
        System.out.print("Enter first binary number: ");
        String a = input.next();

        System.out.print("Enter second binary number: ");
        String b = input.next();

        // Result string
        String result = "";

        // Carry variable
        int carry = 0;

        // Pointers for both strings
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Loop until both strings are processed
        while (i >= 0 || j >= 0) {

            int sum = carry;

            // Add digit from string a
            if (i >= 0) {
                sum = sum + (a.charAt(i) - '0');
                i--;
            }

            // Add digit from string b
            if (j >= 0) {
                sum = sum + (b.charAt(j) - '0');
                j--;
            }

            // Store binary digit
            result = (sum % 2) + result;

            // Update carry
            carry = sum / 2;
        }

        // If carry is left
        if (carry == 1) {
            result = carry + result;
        }

        // Display result
        System.out.println("Binary Sum = " + result);

        input.close();
    }
}
