package com.linearandbinarysearch.challenge.problem1.approach2;

import java.io.*;
import java.util.Scanner;

class FileReadCompare
{
 public static void main(String[] args) throws Exception
 {
     Scanner sc = new Scanner(System.in);

     // Take file path from user
     System.out.print("Enter file path: ");
     String path = sc.nextLine();

     // -------- FileReader --------
     long start1 = System.currentTimeMillis();

     FileReader fr = new FileReader(path);
     BufferedReader br1 = new BufferedReader(fr);

     int words1 = 0;
     String line1;

     while((line1 = br1.readLine()) != null)
     {
         String[] arr = line1.split("\\s+");
         words1 = words1 + arr.length;
     }

     br1.close();

     long end1 = System.currentTimeMillis();
     System.out.println("FileReader word count: " + words1);
     System.out.println("FileReader time: " + (end1 - start1) + " ms");

     // -------- InputStreamReader --------
     long start2 = System.currentTimeMillis();

     InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
     BufferedReader br2 = new BufferedReader(isr);

     int words2 = 0;
     String line2;

     while((line2 = br2.readLine()) != null)
     {
         String[] arr = line2.split("\\s+");
         words2 = words2 + arr.length;
     }

     br2.close();

     long end2 = System.currentTimeMillis();
     System.out.println("InputStreamReader word count: " + words2);
     System.out.println("InputStreamReader time: " + (end2 - start2) + " ms");

     sc.close();
 }
}

