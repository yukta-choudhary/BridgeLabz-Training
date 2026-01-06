package com.day4.petpal;

//Bird class
public class Bird extends Pet implements IInteractable {

 Bird(String name, int age) {
     super(name, "Bird", age);
 }

 public void feed() {
     reduceHunger();
     System.out.println("Bird is eating");
 }

 public void play() {
     improveMood();
     System.out.println("Bird is playing");
 }

 public void sleep() {
     rest();
     System.out.println("Bird is sleeping");
 }

 void makeSound() {
     System.out.println("Bird says: Tweet!");
 }
}

