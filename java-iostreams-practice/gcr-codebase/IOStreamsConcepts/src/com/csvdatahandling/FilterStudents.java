package com.csvdatahandling;

//Filter students scoring above 80

import java.io.*;

public class FilterStudents {
 public static void main(String[] args) throws Exception {

     BufferedReader br = new BufferedReader(new FileReader("data/students.csv"));
     String line;

     br.readLine(); // header

     while ((line = br.readLine()) != null) {
         String[] data = line.split(",");
         int marks = Integer.parseInt(data[3]);

         if (marks > 80) {
             System.out.println(data[1] + " scored " + marks);
         }
     }
     br.close();
 }
}

