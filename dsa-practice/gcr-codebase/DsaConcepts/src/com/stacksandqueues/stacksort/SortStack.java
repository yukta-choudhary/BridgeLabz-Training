package com.stacksandqueues.stacksort;

import java.util.Stack;

//Class to sort stack using recursion
public class SortStack {

 // Sort the stack
 public static void sort(Stack<Integer> st) {

     // Base case
     if (st.isEmpty()) {
         return;
     }

     // Remove top element
     int top = st.pop();

     // Sort remaining stack
     sort(st);

     // Insert element in sorted order
     insertSorted(st, top);
 }

 // Insert element at correct position
 static void insertSorted(Stack<Integer> st, int val) {

     // Base case
     if (st.isEmpty() || st.peek() <= val) {
         st.push(val);
         return;
     }

     // Remove top element
     int top = st.pop();

     // Recursive call
     insertSorted(st, val);

     // Push back element
     st.push(top);
 }
}
