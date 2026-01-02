package com.circularlinkedlist.roundrobinscheduling;

//Node class for Circular Linked List

class ProcessNode {
 int pid;
 int burstTime;
 int remainingTime;
 int waitingTime;
 int turnAroundTime;
 int priority;
 ProcessNode next;

 // Constructor
 ProcessNode(int pid, int burstTime, int priority) {
     this.pid = pid;
     this.burstTime = burstTime;
     this.remainingTime = burstTime;
     this.priority = priority;
     this.next = this; // circular link
 }
}
