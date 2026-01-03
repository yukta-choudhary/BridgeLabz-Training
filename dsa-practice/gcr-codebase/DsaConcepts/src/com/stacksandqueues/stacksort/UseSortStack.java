package com.stacksandqueues.stacksort;

import java.util.Scanner;
import java.util.Stack;

// Main class
public class UseSortStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Take stack input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            st.push(sc.nextInt());
        }

        // Sort the stack
        SortStack.sort(st);

        System.out.println("Sorted Stack (Top to Bottom):");

        // Print stack
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

        sc.close();
    }
}
