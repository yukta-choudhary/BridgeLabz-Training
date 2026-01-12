package com.day2.callcenter;

/*
CallManager class
Uses arrays instead of collections
*/

class CallManager {

    Customer[] vipQueue = new Customer[50];
    Customer[] normalQueue = new Customer[50];

    String[] names = new String[50];
    int[] counts = new int[50];

    int vipRear = 0;
    int normalRear = 0;
    int size = 0;

    // Add customer call
    void addCall(Customer c) {

        // Add to VIP or normal queue
        if (c.vip) {
            vipQueue[vipRear++] = c;
        } else {
            normalQueue[normalRear++] = c;
        }

        // Update call count
        int index = findCustomer(c.name);

        if (index == -1) {
            names[size] = c.name;
            counts[size] = 1;
            size++;
        } else {
            counts[index]++;
        }
    }

    // Find customer index
    int findCustomer(String name) {
        for (int i = 0; i < size; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Serve VIP customers
    void serveVip() {
        for (int i = 0; i < vipRear; i++) {
            System.out.println("Call connected to VIP: " + vipQueue[i].name);
        }
    }

    // Serve normal customers
    void serveNormal() {
        for (int i = 0; i < normalRear; i++) {
            System.out.println("Call connected to: " + normalQueue[i].name);
        }
    }

    // Display call count
    void showCallCount() {
        for (int i = 0; i < size; i++) {
            System.out.println(names[i] + " called " + counts[i] + " times");
        }
    }
}
