package com.day11.geomeasure;

//Main application for comparing lines

import java.util.Scanner;

public class GeoMeasureApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of line comparisons: ");
     int n = sc.nextInt();

     // Store line objects (bonus part)
     Line[] lines1 = new Line[n];
     Line[] lines2 = new Line[n];

     for (int i = 0; i < n; i++) {

         System.out.println("\nEnter coordinates for Line 1:");
         int x1 = sc.nextInt();
         int y1 = sc.nextInt();
         int x2 = sc.nextInt();
         int y2 = sc.nextInt();

         lines1[i] = new Line(x1, y1, x2, y2);

         System.out.println("Enter coordinates for Line 2:");
         int a1 = sc.nextInt();
         int b1 = sc.nextInt();
         int a2 = sc.nextInt();
         int b2 = sc.nextInt();

         lines2[i] = new Line(a1, b1, a2, b2);
     }

     // Compare lines
     for (int i = 0; i < n; i++) {

         double len1 = lines1[i].getLength();
         double len2 = lines2[i].getLength();

         System.out.println("\nComparison " + (i + 1));

         if (len1 == len2) {
             System.out.println("Both lines are equal in length");
         } else if (len1 > len2) {
             System.out.println("Line 1 is longer");
         } else {
             System.out.println("Line 2 is longer");
         }
     }

     sc.close();
 }
}
