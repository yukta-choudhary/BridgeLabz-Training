package com.inheritance.animal;

/*
Dog class inherits Animal
*/

public class Dog extends Animal {

    // Override makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
