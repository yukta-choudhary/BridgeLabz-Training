package com.stacksandqueues.queueusingstack;

import java.util.Stack;

//Queue class using two stacks
public class MyQueue {

 Stack<Integer> s1 = new Stack<>(); // enqueue stack
 Stack<Integer> s2 = new Stack<>(); // dequeue stack

 // Add element to queue
 public void enqueue(int x) {
     s1.push(x);
 }

 // Remove element from queue
 public int dequeue() {
     // If dequeue stack is empty, move elements
     if (s2.isEmpty()) {
         while (!s1.isEmpty()) {
             s2.push(s1.pop());
         }
     }

     // If still empty, queue is empty
     if (s2.isEmpty()) {
         return -1;
     }

     return s2.pop();
 }
}

