package com.linearandbinarysearch.inputstreamreader.problem2;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUserInputToFile {

    public static void main(String[] args) {

        try {
            // Read input from keyboard
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Write data to file
            FileWriter fw = new FileWriter("output.txt");

            System.out.println("Enter text (type 'exit' to stop):");

            String line;

            // Read and write until user enters exit
            while (true) {

                line = br.readLine();

                if (line.equals("exit")) {
                    break; // Stop loop
                }

                fw.write(line + "\n"); // Write line to file
            }

            // Close resources
            fw.close();
            br.close();
            isr.close();

            System.out.println("Data written to file successfully");

        } catch (IOException e) {
            System.out.println("Input or file error occurred");
        }
    }
}
