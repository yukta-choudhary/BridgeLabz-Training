package com.streams;

import java.io.*;

public class BufferedVsNormal {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("bigfile.dat");
        FileOutputStream fos = new FileOutputStream("normalCopy.dat");

        long start = System.nanoTime();
        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }
        long end = System.nanoTime();
        System.out.println("Normal Time: " + (end - start));

        fis.close();
        fos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bigfile.dat"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bufferedCopy.dat"));

        byte[] buffer = new byte[4096];
        start = System.nanoTime();
        int bytesRead;
        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start));

        bis.close();
        bos.close();
    }
}

