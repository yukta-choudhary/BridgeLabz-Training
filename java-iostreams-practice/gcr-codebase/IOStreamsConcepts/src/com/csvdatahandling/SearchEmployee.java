package com.csvdatahandling;
//Search employee by name

import java.io.*;

public class SearchEmployee {
 public static void main(String[] args) throws Exception {

     String searchName = "Bob";

     BufferedReader br = new BufferedReader(new FileReader("data/employees.csv"));
     String line;

     br.readLine(); // header

     while ((line = br.readLine()) != null) {
         String[] data = line.split(",");

         if (data[1].equalsIgnoreCase(searchName)) {
             System.out.println(
                 "Department: " + data[2] +
                 ", Salary: " + data[3]
             );
         }
     }
     br.close();
 }
}
