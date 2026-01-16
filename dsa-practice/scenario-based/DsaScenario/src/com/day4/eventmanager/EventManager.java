package com.day4.eventmanager;

/*
EventManager – Ticket Price Optimizer
Uses Quick Sort to sort ticket prices
*/

import java.util.Scanner;

class EventManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input number of tickets
        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();

        int prices[] = new int[n];

        // input ticket prices
        System.out.println("Enter ticket prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // sort prices using QuickSort class
        QuickSort.sort(prices, 0, n - 1);

        // display sorted prices
        System.out.println("Sorted ticket prices:");
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }
    }
}

