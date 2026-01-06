package com.day5.petpal;

//Dog class
public class Dog extends Pet implements IInteractable {

 Dog(String name, int age) {
     super(name, "Dog", age);
 }

 public void feed() {
     reduceHunger();
     System.out.println("Dog is eating");
 }

 public void play() {
     improveMood();
     System.out.println("Dog is playing");
 }

 public void sleep() {
     rest();
     System.out.println("Dog is sleeping");
 }

 void makeSound() {
     System.out.println("Dog says: Woof!");
 }
}
