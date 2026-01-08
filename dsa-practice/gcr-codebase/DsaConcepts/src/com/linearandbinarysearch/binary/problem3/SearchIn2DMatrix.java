package com.linearandbinarysearch.binary.problem3;

import java.util.Scanner;

class SearchIn2DMatrix
{
 // Method to search target in matrix
 static boolean searchMatrix(int[][] mat, int target)
 {
     int rows = mat.length;
     int cols = mat[0].length;

     int left = 0;
     int right = rows * cols - 1;

     // Binary search loop
     while(left <= right)
     {
         int mid = (left + right) / 2;

         // Convert 1D index to 2D index
         int r = mid / cols;
         int c = mid % cols;

         // If target found
         if(mat[r][c] == target)
         {
             return true;
         }

         // If target is smaller
         if(target < mat[r][c])
         {
             right = mid - 1;
         }
         else
         {
             left = mid + 1; // target is larger
         }
     }
     return false; // target not found
 }

 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);

     // Take rows and columns
     System.out.print("Enter number of rows: ");
     int r = sc.nextInt();

     System.out.print("Enter number of columns: ");
     int c = sc.nextInt();

     int[][] mat = new int[r][c];

     // Take matrix input
     System.out.println("Enter matrix elements:");
     for(int i = 0; i < r; i++)
     {
         for(int j = 0; j < c; j++)
         {
             mat[i][j] = sc.nextInt();
         }
     }

     // Take target value
     System.out.print("Enter target value: ");
     int target = sc.nextInt();

     // Call method
     boolean found = searchMatrix(mat, target);

     // Print result
     System.out.println("Target found: " + found);

     sc.close();
 }
}
