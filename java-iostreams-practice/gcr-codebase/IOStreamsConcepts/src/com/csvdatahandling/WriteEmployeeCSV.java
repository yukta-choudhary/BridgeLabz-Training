package com.csvdatahandling;

//Write employee data to CSV

import java.io.*;

public class WriteEmployeeCSV {
 public static void main(String[] args) throws Exception {

     BufferedWriter bw = new BufferedWriter(new FileWriter("data/employees.csv"));

     bw.write("ID,Name,Department,Salary\n");
     bw.write("101,Alice,HR,50000\n");
     bw.write("102,Bob,IT,60000\n");
     bw.write("103,Charlie,Finance,55000\n");
     bw.write("104,David,IT,65000\n");
     bw.write("105,Eva,Sales,48000\n");

     bw.close();
     System.out.println("CSV Written Successfully");
 }
}
