package com.day3.smartcheckout;

public class CustomerQueue {
    private QueueNode front;
    private QueueNode rear;

    public CustomerQueue() {
        front = null;
        rear = null;
    }

    // Add customer to queue
    public void enqueue(Customer c) {
        QueueNode newNode = new QueueNode(c);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(c.name + " added to the queue.");
    }

    // Remove customer from queue
    public Customer dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return null;
        }
        Customer c = front.customer;
        front = front.next;
        if (front == null) rear = null;
        return c;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }
}
