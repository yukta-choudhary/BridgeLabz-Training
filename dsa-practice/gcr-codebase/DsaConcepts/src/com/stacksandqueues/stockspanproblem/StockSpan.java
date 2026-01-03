package com.stacksandqueues.stockspanproblem;

import java.util.Stack;

//Class to calculate stock span
public class StockSpan {

 // Method to calculate span
 public static int[] calculateSpan(int[] price) {

     int n = price.length;
     int[] span = new int[n];
     Stack<Integer> st = new Stack<>();

     // First day span is always 1
     span[0] = 1;
     st.push(0);

     // Loop from second day
     for (int i = 1; i < n; i++) {

         // Remove smaller prices
         while (!st.isEmpty() && price[st.peek()] <= price[i]) {
             st.pop();
         }

         // Calculate span
         if (st.isEmpty()) {
             span[i] = i + 1;
         } else {
             span[i] = i - st.peek();
         }

         // Push current index
         st.push(i);
     }

     return span;
 }
}

