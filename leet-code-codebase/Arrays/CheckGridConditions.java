/*
3142. Check if Grid Satisfies Conditions

You are given a 2D grid. 
Check if each cell satisfies:
1. Equal to the cell below it (if it exists)
2. Different from the cell to its right (if it exists)
*/

import java.util.Scanner;

public class CheckGridConditions {

    // Method to check grid conditions
    static boolean checkGrid(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Check below cell
                if (i + 1 < m && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }

                // Check right cell
                if (j + 1 < n && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Matrix size
        System.out.print("Enter number of rows: ");
        int m = input.nextInt();
        System.out.print("Enter number of columns: ");
        int n = input.nextInt();

        int[][] grid = new int[m][n];

        // Input grid
        System.out.println("Enter grid elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = input.nextInt();
            }
        }

        // Call method
        boolean result = checkGrid(grid);

        // Output
        System.out.println("Does grid satisfy conditions? " + result);

        input.close();
    }
}
