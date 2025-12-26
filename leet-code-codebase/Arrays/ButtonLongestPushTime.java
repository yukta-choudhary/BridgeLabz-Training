/*
3386. Button with Longest Push Time

You are given a 2D array events where each events[i] = [index, time] represents 
the button pressed at a certain time. 

Return the index of the button that took the longest time to push. 
If multiple buttons have the same longest time, return the smallest index.
*/

import java.util.Scanner;

public class ButtonLongestPushTime {

    // Method to find the button with longest push time
    static int slowestButton(int[][] events) {

        int maxTime = events[0][1]; // Time for first button
        int button = events[0][0];

        for (int i = 1; i < events.length; i++) {

            int index = events[i][0];
            int time = events[i][1] - events[i - 1][1]; // Time difference from previous

            if (time > maxTime) {
                maxTime = time;
                button = index;
            } else if (time == maxTime && index < button) {
                button = index;
            }
        }

        return button;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Number of events
        System.out.print("Enter number of events: ");
        int n = input.nextInt();

        int[][] events = new int[n][2];

        // Input events
        System.out.println("Enter events (index time):");
        for (int i = 0; i < n; i++) {
            events[i][0] = input.nextInt();
            events[i][1] = input.nextInt();
        }

        // Call method
        int result = slowestButton(events);

        // Output
        System.out.println("Button with longest push time: " + result);

        input.close();
    }
}
