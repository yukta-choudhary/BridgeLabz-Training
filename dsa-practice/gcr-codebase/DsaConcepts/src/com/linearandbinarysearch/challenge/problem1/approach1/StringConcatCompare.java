package com.linearandbinarysearch.challenge.problem1.approach1;


import java.util.Scanner;

class StringConcatCompare
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);

     // Take input from user
     System.out.print("Enter number of times to concatenate: ");
     int n = sc.nextInt();

     // -------- StringBuilder --------
     long start1 = System.currentTimeMillis();

     StringBuilder sb = new StringBuilder();
     for(int i = 0; i < n; i++)
     {
         sb.append("hello");
     }

     long end1 = System.currentTimeMillis();
     System.out.println("StringBuilder time: " + (end1 - start1) + " ms");

     // -------- StringBuffer --------
     long start2 = System.currentTimeMillis();

     StringBuffer sbf = new StringBuffer();
     for(int i = 0; i < n; i++)
     {
         sbf.append("hello");
     }

     long end2 = System.currentTimeMillis();
     System.out.println("StringBuffer time: " + (end2 - start2) + " ms");

     sc.close();
 }
}

