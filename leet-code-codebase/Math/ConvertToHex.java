/*
Question 405: Convert a Number to Hexadecimal
Given a 32-bit integer num, return a string representing its hexadecimal representation.
For negative integers, two’s complement method is used.
Letters should be lowercase and no leading zeros except for zero itself.
No built-in methods allowed for direct conversion.
*/

import java.util.Scanner;

public class ConvertToHex {


    // Method to convert number to hex
    public static String toHex(int num) {
        // Special case
        if (num == 0) {
            return "0";
        }

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder hex = new StringBuilder();

        // Use long to handle negative numbers properly
        long n = num;
        if (n < 0) {
            n += 1L << 32; // two's complement
        }

        while (n > 0) {
            int rem = (int)(n % 16);
            hex.insert(0, hexChars[rem]);
            n /= 16;
        }

        return hex.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        String result = toHex(num);
        System.out.println("Hexadecimal: " + result);
    }
}
