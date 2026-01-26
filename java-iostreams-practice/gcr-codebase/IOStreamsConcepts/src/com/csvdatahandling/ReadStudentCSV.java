package com.csvdatahandling;

//Read CSV and print student data

import java.io.*;

/**
 * 
 */
public class ReadStudentCSV {
 public static void main(String[] args) throws Exception {

     BufferedReader br = new BufferedReader(new FileReader("data/students.csv"));
     String line;

     br.readLine(); // skip header

     while ((line = br.readLine()) != null) {
         String[] data = line.split(",");
         System.out.println(
             "ID: " + data[0] +
             ", Name: " + data[1] +
             ", Age: " + data[2] +
             ", Marks: " + data[3]
         );
     }
     br.close();
 }
}
