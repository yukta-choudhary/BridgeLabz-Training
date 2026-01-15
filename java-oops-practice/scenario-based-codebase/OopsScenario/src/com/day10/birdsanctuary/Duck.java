package com.day10.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(int id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println(name + " is flying short distances.");
    }

    public void swim() {
        System.out.println(name + " is swimming in the pond.");
    }
}

