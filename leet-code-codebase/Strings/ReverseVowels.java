/*
	345. Reverse Vowels of a String
	Easy

	Problem:
	Given a string s, reverse only all the vowels in the string and return it.

	Vowels are: a, e, i, o, u (both lowercase and uppercase).

	Example 1:
	Input: s = "IceCreAm"
	Output: "AceCreIm"

	Example 2:
	Input: s = "leetcode"
	Output: "leotcede"
*/

import java.util.Scanner;

public class ReverseVowels {

    // Method to reverse vowels
    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left pointer until vowel found
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // Move right pointer until vowel found
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    // Method to check vowel
    public static boolean isVowel(char c) {

        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }

    // Main method to take input
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        String result = reverseVowels(s);

        System.out.println("Output: " + result);

        sc.close();
    }
}
