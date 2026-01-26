package com.csvdatahandling;

//Read large CSV efficiently

import java.io.*;

public class LargeCSV {
 public static void main(String[] args) throws Exception {

     BufferedReader br = new BufferedReader(new FileReader("data/large.csv"));
     int count = 0;
     String line;

     br.readLine(); // header

     while ((line = br.readLine()) != null) {
         count++;

         if (count % 100 == 0) {
             System.out.println("Processed: " + count);
         }
     }
     br.close();
 }
}
