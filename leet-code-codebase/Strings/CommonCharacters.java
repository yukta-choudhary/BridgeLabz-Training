/*
	1002. Find Common Characters

	Problem:
	Given an array of strings, find characters that appear in ALL strings.
	Duplicate characters should be included.

	Example:
	Input: ["bella","label","roller"]
	Output: e l l
*/

import java.util.Scanner;
import java.util.ArrayList;

public class CommonCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of words
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        // Input words
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // Frequency array for first word
        int[] minFreq = new int[26];

        // Count frequency of first word
        for (int i = 0; i < words[0].length(); i++) {
            char ch = words[0].charAt(i);
            minFreq[ch - 'a']++;
        }

        // Compare with remaining words
        for (int i = 1; i < n; i++) {

            int[] freq = new int[26];

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                freq[ch - 'a']++;
            }

            // Take minimum frequency
            for (int k = 0; k < 26; k++) {
                if (freq[k] < minFreq[k]) {
                    minFreq[k] = freq[k];
                }
            }
        }

        // Store result
        ArrayList<Character> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add((char)(i + 'a'));
                minFreq[i]--;
            }
        }

        // Output
        System.out.println("Common characters:");
        for (char ch : result) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
