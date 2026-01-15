package com.day3.smartcheckout;


public class Customer {
    String name;
    String[] items; // list of item names customer wants

    public Customer(String name, int itemCount) {
        this.name = name;
        this.items = new String[itemCount];
    }
}
