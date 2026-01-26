package com.csvdatahandling;

//Validate email and phone

import java.io.*;

public class ValidateCSV {
 public static void main(String[] args) throws Exception {

     BufferedReader br = new BufferedReader(new FileReader("data/users.csv"));
     String line;

     br.readLine(); // header

     while ((line = br.readLine()) != null) {
         String[] d = line.split(",");

         if (!d[2].matches("^[A-Za-z0-9+_.-]+@(.+)$") ||
             !d[3].matches("\\d{10}")) {

             System.out.println("Invalid Row: " + line);
         }
     }
     br.close();
 }
}

