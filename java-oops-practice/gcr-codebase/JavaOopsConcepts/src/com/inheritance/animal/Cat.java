package com.inheritance.animal;

/*
Cat class inherits Animal
*/

public class Cat extends Animal {

    // Override makeSound method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
