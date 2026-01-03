/*
	389. Find the Difference
	Easy

	Problem:
	You are given two strings s and t.
	String t is formed by shuffling s and adding one extra character.
	Return the extra character.

	Example 1:
	Input: s = "abcd", t = "abcde"
	Output: e

*/

import java.util.Scanner;

public class FindTheDifference {

    // Method to find extra character
    public static char findTheDifference(String s, String t) {

        int[] freq = new int[26]; // frequency array

        // Count characters of s
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Subtract characters of t
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        // Find character with -1 count
        for (int i = 0; i < 26; i++) {
            if (freq[i] == -1) {
                return (char) (i + 'a');
            }
        }

        return ' ';
    }

    // Main method to take input
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        char result = findTheDifference(s, t);

        System.out.println("Output: " + result);

        sc.close();
    }
}
