package com.day2.callcenter;

/*
CallManager class
Manages queues and call data
*/

import java.util.*;

class CallManager {

    Queue<Customer> normalQueue = new LinkedList<>();
    PriorityQueue<Customer> vipQueue;
    HashMap<String, Integer> callCount = new HashMap<>();

    // Constructor
    CallManager() {

        // Priority based on name (simple rule)
        vipQueue = new PriorityQueue<>(new Comparator<Customer>() {
            public int compare(Customer a, Customer b) {
                return a.name.compareTo(b.name);
            }
        });
    }

    // Add customer call
    void addCall(Customer c) {

        // Add to correct queue
        if (c.vip) {
            vipQueue.add(c);
        } else {
            normalQueue.add(c);
        }

        // Update call count
        if (callCount.containsKey(c.name)) {
            callCount.put(c.name, callCount.get(c.name) + 1);
        } else {
            callCount.put(c.name, 1);
        }
    }

    // Serve VIP calls
    void serveVip() {
        while (!vipQueue.isEmpty()) {
            System.out.println("Call connected to VIP: " + vipQueue.poll().name);
        }
    }

    // Serve normal calls
    void serveNormal() {
        while (!normalQueue.isEmpty()) {
            System.out.println("Call connected to: " + normalQueue.poll().name);
        }
    }

    // Display call count
    void showCallCount() {
        for (String key : callCount.keySet()) {
            System.out.println(key + " called " + callCount.get(key) + " times");
        }
    }
}
