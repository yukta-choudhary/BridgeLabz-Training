package com.inheritance.animal;

/*
Main class to demonstrate polymorphism
*/

public class Main {

    public static void main(String[] args) {

        // Parent reference holding child objects
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        // Polymorphism in action
        dog.makeSound();   // Dog barks
        cat.makeSound();   // Cat meows
        bird.makeSound();  // Bird chirps
    }
}
