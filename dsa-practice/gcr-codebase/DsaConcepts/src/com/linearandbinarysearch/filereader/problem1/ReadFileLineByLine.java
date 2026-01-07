package com.linearandbinarysearch.filereader.problem1;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        try {
            // Create FileReader
            FileReader fr = new FileReader("sample.txt");

            // Wrap with BufferedReader
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("File error occurred");
        }
    }
}
