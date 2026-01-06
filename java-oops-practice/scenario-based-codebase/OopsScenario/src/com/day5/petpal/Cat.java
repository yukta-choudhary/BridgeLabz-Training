package com.day5.petpal;

//Cat class
public class Cat extends Pet implements IInteractable {

 Cat(String name, int age) {
     super(name, "Cat", age);
 }

 public void feed() {
     reduceHunger();
     System.out.println("Cat is eating");
 }

 public void play() {
     improveMood();
     System.out.println("Cat is playing");
 }

 public void sleep() {
     rest();
     System.out.println("Cat is sleeping");
 }

 void makeSound() {
     System.out.println("Cat says: Meow!");
 }
}

