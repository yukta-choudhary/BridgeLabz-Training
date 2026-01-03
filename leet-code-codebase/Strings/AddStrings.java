/*
	415. Add Strings

	Problem:
	Given two non-negative integers num1 and num2 represented as strings,
	return their sum as a string.

	Do not use BigInteger or convert strings directly to integers.

	Example 1:
	Input: num1 = "11", num2 = "123"
	Output: "134"

*/

import java.util.Scanner;

public class AddStrings {

    // Method to add two numeric strings
    public static String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        // Loop till both strings are processed
        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 10); // store digit
            carry = sum / 10;    // update carry
        }

        // Reverse result
        return sb.reverse().toString();
    }

    // Main method to take input
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number string: ");
        String num1 = sc.nextLine();

        System.out.print("Enter second number string: ");
        String num2 = sc.nextLine();

        String result = addStrings(num1, num2);

        System.out.println("Output: " + result);

        sc.close();
    }
}
