package com.day5.cropmonitor;

//CropMonitor.java
//Main class for Sensor Data Ordering

import java.util.Scanner;

class CropMonitor {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // take number of sensor readings
     System.out.print("Enter number of sensor readings: ");
     int n = sc.nextInt();

     int[] timestamps = new int[n];

     // take unordered timestamps
     System.out.println("Enter sensor timestamps:");
     for (int i = 0; i < n; i++) {
         timestamps[i] = sc.nextInt();
     }

     // sort timestamps using quick sort
     SensorSorter.quickSort(timestamps, 0, n - 1);

     // display sorted timestamps
     System.out.println("Sorted sensor timestamps:");
     SensorSorter.display(timestamps, n);

     sc.close();
 }
}
