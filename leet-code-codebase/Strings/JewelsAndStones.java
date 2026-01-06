/*  Jewels and Stones
	Problem:
	You are given two strings jewels and stones.
	Each character in stones represents a stone you have.
	Count how many stones are also jewels.
*/

import java.util.Scanner;
import java.util.HashSet;

public class JewelsAndStones {

    // Method to count jewels
    static int countJewels(String jewels, String stones) {

        int count = 0;

        // Store jewels in HashSet
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        // Check each stone
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input jewels
        System.out.print("Enter jewels string: ");
        String jewels = sc.nextLine();

        // Input stones
        System.out.print("Enter stones string: ");
        String stones = sc.nextLine();

        // Call method
        int result = countJewels(jewels,
