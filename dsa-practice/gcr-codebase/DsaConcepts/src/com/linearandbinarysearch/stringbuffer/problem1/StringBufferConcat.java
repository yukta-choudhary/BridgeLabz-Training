package com.linearandbinarysearch.stringbuffer.problem1;

/*
Problem 1: Concatenate Strings Efficiently Using StringBuffer
Take multiple strings from user and concatenate them
*/

import java.util.Scanner;

public class StringBufferConcat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        String[] arr = new String[n]; // String array

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        StringBuffer sb = new StringBuffer(); // Create StringBuffer

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]); // Append strings
        }

        System.out.println("Concatenated String: " + sb.toString());

        sc.close();
    }
}
