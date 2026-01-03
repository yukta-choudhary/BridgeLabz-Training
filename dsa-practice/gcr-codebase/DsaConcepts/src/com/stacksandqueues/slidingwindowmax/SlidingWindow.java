package com.stacksandqueues.slidingwindowmax;

import java.util.Deque;
import java.util.LinkedList;

// Class to find sliding window maximum
public class SlidingWindow {

    // Method to find maximum in each window
    public static int[] maxWindow(int[] arr, int k) {

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        int idx = 0;

        for (int i = 0; i < n; i++) {

            // Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.addLast(i);

            // Store max after first window
            if (i >= k - 1) {
                result[idx++] = arr[dq.peekFirst()];
            }
        }

        return result;
    }
}
