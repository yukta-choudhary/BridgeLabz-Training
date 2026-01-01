/*
Question: Add Strings
Given two non-negative integers num1 and num2 represented as strings,
return the sum of num1 and num2 as a string.
Do not use BigInteger or convert the strings to integers directly.
*/

import java.util.Scanner;

public class AddStringsProblem {


    // Method to add two string numbers
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1; // pointer for num1
        int j = num2.length() - 1; // pointer for num2
        int carry = 0;

        // Loop from end to start
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sum = sum % 10;

			// prepend the digit
            result.insert(0, sum); 
            i--;
            j--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String num1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String num2 = sc.nextLine();

        String sum = addStrings(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
