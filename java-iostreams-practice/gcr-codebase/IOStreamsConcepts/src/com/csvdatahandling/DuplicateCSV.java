package com.csvdatahandling;

//Detect duplicate IDs

import java.io.*;
import java.util.*;

public class DuplicateCSV {
 public static void main(String[] args) throws Exception {

     Set<String> ids = new HashSet<>();
     BufferedReader br = new BufferedReader(new FileReader("data/students.csv"));
     String line;

     br.readLine();

     while ((line = br.readLine()) != null) {
         String id = line.split(",")[0];
         if (!ids.add(id)) {
             System.out.println("Duplicate: " + line);
         }
     }
     br.close();
 }
}
