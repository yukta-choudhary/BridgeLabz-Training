/*
	383. Ransom Note

	Problem:
	Given two strings ransomNote and magazine,
	return true if ransomNote can be formed using letters from magazine.
	Each letter in magazine can be used only once.

	Example:
	Input: ransomNote = "aa", magazine = "aab"
	Output: true
*/

import java.util.Scanner;

public class RansomNote {

    // Method to check ransom note
    static boolean canConstruct(String ransomNote, String magazine) {

        // Frequency array for magazine letters
        int[] freq = new int[26];

        // Count letters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            freq[ch - 'a']++;
        }

        // Check ransomNote letters
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            // If letter not available
            if (freq[ch - 'a'] == 0) {
                return false;
            }

            // Use one letter
            freq[ch - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input ransom note
        System.out.print("Enter ransom note: ");
        String ransomNote = sc.nextLine();

        // Input magazine
        System.out.print("Enter magazine string: ");
        String magazine = sc.nextLine();

        // Call method
        boolean result = canConstruct(ransomNote, magazine);

        // Output
        System.out.println("Can construct ransom note: " + result);

        sc.close();
    }
}
