package com.day3.smartcheckout;
public class QueueNode {
    Customer customer;
    QueueNode next;

    public QueueNode(Customer customer) {
        this.customer = customer;
        this.next = null;
    }
}

