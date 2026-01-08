/*
LeetCode 867: Transpose Matrix
Convert rows into columns and columns into rows
*/

import java.util.Scanner;

public class TransposeMatrix
{
    // Method to transpose matrix
    static int[][] transpose(int[][] matrix)
    {
        int m = matrix.length;        // rows
        int n = matrix[0].length;     // columns

        int[][] result = new int[n][m];

        // Swap row and column
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int m = sc.nextInt();

        System.out.println("Enter number of columns:");
        int n = sc.nextInt();

        int[][] matrix = new int[m]()
