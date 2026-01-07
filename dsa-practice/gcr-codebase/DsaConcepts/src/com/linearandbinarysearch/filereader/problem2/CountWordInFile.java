package com.linearandbinarysearch.filereader.problem2;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordInFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        int count = 0; // Counter

        try {
            // Create FileReader
            FileReader fr = new FileReader(fileName);

            // Wrap with BufferedReader
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                String[] words = line.split(" "); // Split line into words

                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(word)) {
                        count++; // Increase count
                    }
                }
            }

            // Close resources
            br.close();
            fr.close();

            System.out.println("Word count: " + count);

        } catch (IOException e) {
            System.out.println("File error occurred");
        }

        sc.close();
    }
}
