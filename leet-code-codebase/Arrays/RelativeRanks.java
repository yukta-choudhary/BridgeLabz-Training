/*
506. Relative Ranks
Assign ranks to athletes based on their scores
*/

import java.util.Scanner;
import java.util.Arrays;

public class RelativeRanks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of athletes: ");
        int n = sc.nextInt();

        int[] score = new int[n];

        // Take scores as input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score of athlete " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }

        String[] result = findRelativeRanks(score);

        // Print result
        System.out.println("Ranks:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }

    // Method to find relative ranks
    public static String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] ans = new String[n];

        int[] temp = score.clone(); // Copy array
        Arrays.sort(temp);          // Sort scores

        // Assign ranks
        for (int i = 0; i < n; i++) {

            int rank = n - getIndex(temp, score[i]);

            if (rank == 1) {
                ans[i] = "Gold Medal";
            } else if (rank == 2) {
                ans[i] = "Silver Medal";
            } else if (rank == 3) {
                ans[i] = "Bronze Medal";
            } else {
                ans[i] = String.valueOf(rank);
            }
        }

        return ans;
    }

    // Find index of element in array
    public static int getIndex(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
