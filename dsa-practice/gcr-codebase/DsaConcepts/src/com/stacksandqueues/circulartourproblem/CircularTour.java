package com.stacksandqueues.circulartourproblem;

import java.util.LinkedList;
import java.util.Queue;

// Class to solve circular tour problem
public class CircularTour {

    // Method to find starting pump
    public static int findStart(PetrolPump[] arr) {

        Queue<Integer> q = new LinkedList<>();
        int currPetrol = 0;
        int start = 0;
        int i = 0;
        int n = arr.length;

        // Loop until all pumps are checked
        while (q.size() < n) {

            currPetrol += arr[i].petrol - arr[i].distance;
            q.add(i);

            // If petrol becomes negative, reset
            while (currPetrol < 0 && !q.isEmpty()) {
                int idx = q.poll();
                currPetrol -= arr[idx].petrol - arr[idx].distance;
                start = i + 1;
            }

            i = (i + 1) % n;

            // If full cycle done and queue empty
            if (i == start && q.isEmpty()) {
                return -1;
            }
        }

        return q.peek();
    }
}
