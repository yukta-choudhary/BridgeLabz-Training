package com.inheritance.restaurant;

/*
Chef class
Extends Person and implements Worker
*/

public class Chef extends Person implements Worker {

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking food");
    }
}
