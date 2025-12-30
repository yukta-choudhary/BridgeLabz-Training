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


public class AddBinary {

    public static void main(String[] args) {

        // Given binary strings
        String a = "1010";
        String b = "1011";

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

            // Binary digit result
            result = (sum % 2) + result;

            // Carry update
            carry = sum / 2;
        }

        // If carry remains
        if (carry == 1) {
            result = carry + result;
        }

        // Output
        System.out.println("Binary Sum = " + result);
    }
}
