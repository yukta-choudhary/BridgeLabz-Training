package com.day4.examcell;

/*
ExamCell – Student Rank Generator
Uses Merge Sort to generate rank list
*/

import java.util.Scanner;

class ExamCell {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int scores[] = new int[n];

        // input scores
        System.out.println("Enter student scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // sort scores using merge sort
        MergeSort.sort(scores, 0, n - 1);

        // display rank list (highest score first)
        System.out.println("State-level Rank List:");
        int rank = 1;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("Rank " + rank + " : " + scores[i]);
            rank++;
        }
    }
}

