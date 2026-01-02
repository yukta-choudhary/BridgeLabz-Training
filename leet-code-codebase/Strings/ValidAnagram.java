/* Question 42: Valid Anagram
 Given two strings s and t,check if t is an anagram of s.
Return true if both contain same characters
with same frequency, else false. */

import java.util.Scanner;

class ValidAnagram {

    static boolean isAnagram(String s, String t) {

        // if lengths differ, not anagram
        if (s.length() != t.length())
            return false;

        int[] count = new int[26]; // for a-z

        // count characters in s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // reduce count using t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        System.out.println(isAnagram(s, t));

        sc.close();
    }
}
