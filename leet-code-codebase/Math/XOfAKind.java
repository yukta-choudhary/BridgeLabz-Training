/*
Question: X of a Kind in a Deck of Cards
Given an integer array deck, check if it's possible to partition the cards
into groups of exactly x cards (x > 1) where all cards in a group have the same number.
Return true if possible, else false.
*/

import java.util.Scanner;

public class XOfAKind {


    // Method to find GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to check if partition is possible
    public static boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000]; // as deck[i] < 104

        // Count frequency of each number
        for (int num : deck) {
            count[num]++;
        }

        int g = 0; // gcd of counts
        for (int c : count) {
            if (c > 0) {
                if (g == 0) {
                    g = c;
                } else {
                    g = gcd(g, c);
                }
            }
        }

        // If gcd >= 2, we can partition
        return g >= 2;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cards: ");
        int n = sc.nextInt();

        int[] deck = new int[n];
        System.out.println("Enter card numbers:");
        for (int i = 0; i < n; i++) {
            deck[i] = sc.nextInt();
        }

        boolean result = hasGroupsSizeX(deck);
        System.out.println("Can partition? " + result);
    }
}
