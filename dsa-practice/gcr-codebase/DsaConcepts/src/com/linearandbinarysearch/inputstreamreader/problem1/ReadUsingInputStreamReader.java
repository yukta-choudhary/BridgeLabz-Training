package com.linearandbinarysearch.inputstreamreader.problem1;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadUsingInputStreamReader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {
            // Read bytes from file
            FileInputStream fis = new FileInputStream(fileName);

            // Convert byte stream to character stream (UTF-8)
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

            // Wrap with BufferedReader
            BufferedReader br = new BufferedReader(isr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("File or encoding error occurred");
        }

        sc.close();
    }
}

