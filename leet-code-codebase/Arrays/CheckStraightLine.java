/* 
1232. Check If It Is a Straight Line

You are given an array of coordinates where each coordinate represents a point (x, y).
Check whether all the given points lie on a straight line.

Example 1:
Input: [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

Example 2:
Input: [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
*/

import java.util.Scanner;

public class CheckStraightLine {

    // Method to check straight line
    static boolean checkStraightLine(int[][] coordinates) {

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        // Compare slopes using cross multiplication
        for (int i = 2; i < coordinates.length; i++) {

            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y2 - y1) * (x - x1) != (y - y1) * (x2 - x1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Number of points
        System.out.print("Enter number of points: ");
        int n = input.nextInt();

        int[][] coordinates = new int[n][2];

        // Input coordinates
        System.out.println("Enter coordinates:");
        for (int i = 0; i < n; i++) {
            coordinates[i][0] = input.nextInt();
            coordinates[i][1] = input.nextInt();
        }

        // Call method
        boolean result = checkStraightLine(coordinates);

        // Output
        System.out.println("Is straight line: " + result);

        input.close();
    }
}
