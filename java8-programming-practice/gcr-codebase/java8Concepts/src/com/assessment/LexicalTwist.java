package com.assessment;

import java.util.Scanner;

public class LexicalTwist {

    // Case 1
    public static void reversedWordTransform(String word) {
        String reversed = new StringBuilder(word).reverse().toString().toLowerCase();
        String transformed = reversed.replaceAll("[aeiou]", "@");
        System.out.println(transformed);
    }

    // Case 2
    public static void notReversedWordTransform(String word1, String word2) {

        String upperWord = (word1 + word2).toUpperCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < upperWord.length(); i++) {
            char ch = upperWord.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            } else {
                consonants++;
            }
        }

        // Step 4
        if (vowels > consonants) {
            printFirstTwoUniqueVowels(upperWord);
        } else if (consonants > vowels) {
            printFirstTwoUniqueConsonants(upperWord);
        } else {
            System.out.println("Vowels and consonants are equal");
        }
    }

    public static void printFirstTwoUniqueVowels(String word) {
        String result = "";

        for (int i = 0; i < word.length() && result.length() < 2; i++) {
            char ch = word.charAt(i);

            if ("AEIOU".indexOf(ch) != -1 && result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static void printFirstTwoUniqueConsonants(String word) {
        String result = "";

        for (int i = 0; i < word.length() && result.length() < 2; i++) {
            char ch = word.charAt(i);

            if ("AEIOU".indexOf(ch) == -1 && result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        // Validation
        if (first.contains(" ") || second.contains(" ")) {
            System.out.println(first + " is an invalid word");
            sc.close();
            return;
        }

        String reversedFirst = new StringBuilder(first).reverse().toString();

        if (reversedFirst.equalsIgnoreCase(second)) {
            reversedWordTransform(first);
        } else {
            notReversedWordTransform(first, second);
        }

        sc.close();
    }
}
