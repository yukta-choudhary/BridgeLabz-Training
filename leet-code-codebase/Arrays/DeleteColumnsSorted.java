/*
Question: 944. Delete Columns to Make Sorted
Task: Count how many columns are NOT lexicographically sorted.
Logic: Check each column top to bottom.
If any column breaks order, delete it.
*/

import java.util.Scanner;

public class DeleteColumnsSorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of strings
        int n = sc.nextInt();
        sc.nextLine();

        // Store strings
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        int deleteCount = 0;
        int cols = strs[0].length();

        // Check each column
        for (int c = 0; c < cols; c++) {

            // Compare rows in same column
            for (int r = 0; r < n - 1; r++) {

                if (strs[r].charAt(c) > strs[r + 1].charAt(c)) {
                    deleteCount++;
                    break; // stop checking this column
                }
            }
        }

        // Output result
        System.out.println(deleteCount);

        sc.close();
    }
}
