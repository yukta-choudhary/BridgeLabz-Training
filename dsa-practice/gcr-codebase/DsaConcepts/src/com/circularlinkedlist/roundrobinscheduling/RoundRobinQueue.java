package com.circularlinkedlist.roundrobinscheduling;

//Circular Linked List for Round Robin Scheduling

class RoundRobinQueue {
 ProcessNode head;
 ProcessNode current;
 int totalProcesses = 0;

 // Add process at end
 void addProcess(int pid, int burst, int priority) {
     ProcessNode newNode = new ProcessNode(pid, burst, priority);

     if (head == null) {
         head = current = newNode;
     } else {
         ProcessNode temp = head;
         while (temp.next != head) {
             temp = temp.next;
         }
         temp.next = newNode;
         newNode.next = head;
     }
     totalProcesses++;
 }

 // Remove process by PID
 void removeProcess(int pid) {
     if (head == null)
         return;

     ProcessNode temp = head;
     ProcessNode prev = null;

     do {
         if (temp.pid == pid) {

             if (temp == head && temp.next == head) {
                 head = current = null;
             } else if (temp == head) {
                 ProcessNode last = head;
                 while (last.next != head) {
                     last = last.next;
                 }
                 head = head.next;
                 last.next = head;
             } else {
                 prev.next = temp.next;
             }

             totalProcesses--;
             return;
         }
         prev = temp;
         temp = temp.next;

     } while (temp != head);
 }

 // Display processes
 void displayQueue() {
     if (head == null) {
         System.out.println("No processes");
         return;
     }

     ProcessNode temp = head;
     do {
         System.out.println(
             "PID:" + temp.pid +
             " Remaining:" + temp.remainingTime
         );
         temp = temp.next;
     } while (temp != head);
 }

 // Round Robin Scheduling
 void schedule(int timeQuantum) {
     int time = 0;
     int completed = 0;
     float totalWT = 0, totalTAT = 0;

     current = head;

     while (completed < totalProcesses) {

         if (current.remainingTime > 0) {

             if (current.remainingTime > timeQuantum) {
                 time += timeQuantum;
                 current.remainingTime -= timeQuantum;
             } else {
                 time += current.remainingTime;
                 current.remainingTime = 0;

                 current.turnAroundTime = time;
                 current.waitingTime =
                     current.turnAroundTime - current.burstTime;

                 totalWT += current.waitingTime;
                 totalTAT += current.turnAroundTime;

                 completed++;
             }

             System.out.println("\nAfter round:");
             displayQueue();
         }

         current = current.next;
     }

     System.out.println("\nAverage Waiting Time = " + (totalWT / totalProcesses));
     System.out.println("Average Turn Around Time = " + (totalTAT / totalProcesses));
 }
}
