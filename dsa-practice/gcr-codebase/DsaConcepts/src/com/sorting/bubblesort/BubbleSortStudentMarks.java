package com.sorting.bubblesort;

import java.util.Scanner;

public class BubbleSortStudentMarks {

    // Method to perform bubble sort
    public static void bubbleSort(int[] marks) {

        int n = marks.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (marks[j] > marks[j + 1]) {

                    // Swap marks
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap happened, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ":");
            marks[i] = sc.nextInt();
        }

        // Sorting marks
        bubbleSort(marks);

        // Display sorted marks
        System.out.println("Sorted Student Marks (Ascending):");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}
