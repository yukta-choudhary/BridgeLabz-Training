package com.streams;

import java.io.*;

public class UpperToLower {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw =
                new BufferedWriter(new FileWriter("output.txt"));

        int ch;
        while ((ch = br.read()) != -1) {
            bw.write(Character.toLowerCase(ch));
        }

        br.close();
        bw.close();
        System.out.println("Converted successfully");
    }
}
