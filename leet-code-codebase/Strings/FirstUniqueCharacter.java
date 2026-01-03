/*
	387. First Unique Character in a String

	Problem:
	Given a string s, find the first non-repeating character in it
	and return its index. If it does not exist, return -1.

	Example 1:
	Input: s = "leetcode"
	Output: 0

*/

import java.util.Scanner;

public class FirstUniqueCharacter {

    // Method to find first unique character index
    public static int firstUniqChar(String s) {

        int[] freq = new int[26]; // frequency of characters

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    // Main method to take input
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int result = firstUniqChar(s);

        System.out.println("Output: " + result);

        sc.close();
    }
}
