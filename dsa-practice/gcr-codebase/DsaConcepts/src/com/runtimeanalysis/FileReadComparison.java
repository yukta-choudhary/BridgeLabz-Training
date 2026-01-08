package com.runtimeanalysis;

/*
Problem 4: File Reading Performance
*/

import java.io.*;

public class FileReadComparison
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("sample.txt");

        long s1 = System.nanoTime();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1) { }
        fr.close();
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        InputStreamReader isr =
            new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1) { }
        isr.close();
        long e2 = System.nanoTime();

        System.out.println("FileReader: " + (e1 - s1));
        System.out.println("InputStreamReader: " + (e2 - s2));
    }
}
