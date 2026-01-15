package com.day2.trafficmanager;

//Queue using array
class CarQueue {

 String[] arr = new String[10];
 int front = 0;
 int rear = -1;
 int size = 0;

 // Add car to queue
 void enqueue(String car) {

     if (size == arr.length) {
         System.out.println("Queue Overflow");
         return;
     }

     rear++;
     arr[rear] = car;
     size++;
 }

 // Remove car from queue
 String dequeue() {

     if (size == 0) {
         System.out.println("Queue Underflow");
         return null;
     }

     String car = arr[front];
     front++;
     size--;
     return car;
 }

 // Check empty
 boolean isEmpty() {
     return size == 0;
 }
}
