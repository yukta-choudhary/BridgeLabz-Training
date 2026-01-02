package com.circularlinkedlist.roundrobinscheduling;

//Main class for Round Robin Scheduling

import java.util.Scanner;

public class RoundRobinMain {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     RoundRobinQueue queue = new RoundRobinQueue();

     int n, pid, burst, priority, tq;

     System.out.print("Enter number of processes: ");
     n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         System.out.print("Enter PID BurstTime Priority: ");
         pid = sc.nextInt();
         burst = sc.nextInt();
         priority = sc.nextInt();
         queue.addProcess(pid, burst, priority);
     }

     System.out.print("Enter Time Quantum: ");
     tq = sc.nextInt();

     queue.schedule(tq);

     sc.close();
 }
}

