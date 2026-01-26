package com.csvdatahandling;

//Increase IT salary by 10%

import java.io.*;

public class UpdateSalary {
 public static void main(String[] args) throws Exception {

     BufferedReader br = new BufferedReader(new FileReader("data/employees.csv"));
     BufferedWriter bw = new BufferedWriter(new FileWriter("data/output/updated_employees.csv"));

     String line;
     bw.write(br.readLine() + "\n"); // write header

     while ((line = br.readLine()) != null) {
         String[] data = line.split(",");

         if (data[2].equalsIgnoreCase("IT")) {
             int salary = Integer.parseInt(data[3]);
             salary = salary + (salary * 10 / 100);
             data[3] = String.valueOf(salary);
         }

         bw.write(String.join(",", data) + "\n");
     }

     br.close();
     bw.close();
 }
}
