package com.csvdatahandling.csvtoobjects;

//Convert CSV to Student objects

import java.io.*;
import java.util.*;

public class CSVToObject {
 public static void main(String[] args) throws Exception {

     List<Student> list = new ArrayList<>();
     BufferedReader br = new BufferedReader(new FileReader("data/students.csv"));
     String line;

     br.readLine(); // header

     while ((line = br.readLine()) != null) {
         String[] d = line.split(",");
         Student s = new Student();
         s.id = Integer.parseInt(d[0]);
         s.name = d[1];
         s.age = Integer.parseInt(d[2]);
         s.marks = Integer.parseInt(d[3]);
         list.add(s);
     }

     br.close();

     for (Student s : list) {
         System.out.println(s.name + " - " + s.marks);
     }
 }
}
