package com.csvdatahandling;

//Sort employees by salary

import java.io.*;
import java.util.*;

public class SortBySalary {
 public static void main(String[] args) throws Exception {

     BufferedReader br = new BufferedReader(new FileReader("data/employees.csv"));
     List<String[]> list = new ArrayList<>();

     br.readLine(); // header
     String line;

     while ((line = br.readLine()) != null) {
         list.add(line.split(","));
     }
     br.close();

     // Sort descending
     list.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

     for (int i = 0; i < 5 && i < list.size(); i++) {
         System.out.println(list.get(i)[1] + " - " + list.get(i)[3]);
     }
 }
}
