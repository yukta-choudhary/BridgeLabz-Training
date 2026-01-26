package com.csvdatahandling;

//Count records in CSV

import java.io.*;

public class CountCSVRows {
 public static void main(String[] args) throws Exception {

     BufferedReader br = new BufferedReader(new FileReader("data/students.csv"));
     int count = 0;
     String line;

     br.readLine(); // skip header

     while ((line = br.readLine()) != null) {
         count++;
     }

     br.close();
     System.out.println("Total Records: " + count);
 }
}
