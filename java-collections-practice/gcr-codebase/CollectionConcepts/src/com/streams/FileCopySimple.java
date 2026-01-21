package com.streams;
//Read data from one file and write to another file
import java.io.*;
import java.util.Scanner;

public class FileCopySimple {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter source file name: ");
     String source = sc.nextLine();

     System.out.print("Enter destination file name: ");
     String dest = sc.nextLine();

     try (FileInputStream fis = new FileInputStream(source);
          FileOutputStream fos = new FileOutputStream(dest)) {

         int data;
         while ((data = fis.read()) != -1) {
             fos.write(data);
         }
         System.out.println("File copied successfully");

     } catch (IOException e) {
         System.out.println("Source file does not exist");
     }
     sc.close();;
 }
}
