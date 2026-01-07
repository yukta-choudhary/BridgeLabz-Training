package com.linearandbinarysearch.stringbuffer.problem2;

/*
StringBuffer Problem 2:
Compare StringBuffer and StringBuilder for string concatenation
*/

public class StringBufferVsBuilder {

    public static void main(String[] args) {

        int n = 1000000; // Number of times to append

        // ---------- StringBuffer ----------
        StringBuffer sbuf = new StringBuffer();

        long startBuffer = System.nanoTime(); // Start time

        for (int i = 0; i < n; i++) {
            sbuf.append("hello");
        }

        long endBuffer = System.nanoTime(); // End time
        long bufferTime = endBuffer - startBuffer;

        // ---------- StringBuilder ----------
        StringBuilder sbld = new StringBuilder();

        long startBuilder = System.nanoTime(); // Start time

        for (int i = 0; i < n; i++) {
            sbld.append("hello");
        }

        long endBuilder = System.nanoTime(); // End time
        long builderTime = endBuilder - startBuilder;

        // ---------- Output ----------
        System.out.println("Time taken by StringBuffer  : " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder : " + builderTime + " ns");
    }
}

