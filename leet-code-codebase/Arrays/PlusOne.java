/*
Question 66: Plus One

You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant.

Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]

*/

class PlusOne {
    public static int[] plusOne(int[] digits) {

        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and continue
            digits[i] = 0;
        }

        // If all digits were 9, create a new array
        int[] result = new int[digits.length + 1];
        result[0] = 1; 

        return result;
    }
    public static void main(String[] args) {

        int[] digits = {9, 9, 9};

        int[] ans = plusOne(digits);

        // Print result
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
