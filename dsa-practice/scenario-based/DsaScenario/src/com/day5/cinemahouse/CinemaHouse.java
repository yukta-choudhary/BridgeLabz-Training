package com.day5.cinemahouse;

//CinemaHouse.java
//Main class for Movie Time Sorting

import java.util.Scanner;

class CinemaHouse {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // take number of movie shows
     System.out.print("Enter number of movie shows: ");
     int n = sc.nextInt();

     int[] showTimes = new int[n];

     // take show times from user
     System.out.println("Enter show times (in hours):");
     for (int i = 0; i < n; i++) {
         showTimes[i] = sc.nextInt();
     }

     // sort show times using bubble sort
     ShowSorter.bubbleSort(showTimes, n);

     // display sorted show times
     System.out.println("Sorted movie show times:");
     ShowSorter.display(showTimes, n);

     sc.close();
 }
}

