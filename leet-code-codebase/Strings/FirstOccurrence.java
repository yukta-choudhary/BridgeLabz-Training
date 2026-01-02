// Question 28: Find the Index of the First Occurrence in a String
// Return index of first occurrence of needle in haystack.


import java.util.Scanner;

public class FirstOccurrence {

    public static int strStr(String haystack, String needle) {

        // loop through haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            // match needle characters
            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // full match
            if (j == needle.length())
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter haystack: ");
        String haystack = sc.nextLine();

        System.out.print("Enter needle: ");
        String needle = sc.nextLine();

        System.out.println(strStr(haystack, needle));

        sc.close();
    }
}
