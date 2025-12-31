package com.inheritance.animal;

/*
Bird class inherits Animal
*/

public class Bird extends Animal {

    // Override makeSound method
    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}
