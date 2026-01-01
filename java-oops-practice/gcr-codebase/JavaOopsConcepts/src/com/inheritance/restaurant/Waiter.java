package com.inheritance.restaurant;

/*
Waiter class
Extends Person and implements Worker
*/

public class Waiter extends Person implements Worker {

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving customers");
    }
}
