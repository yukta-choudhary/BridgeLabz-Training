package com.annotations.useoverride;

//Child class
public class Dog extends Animal {

 // Override parent method
 @Override
 public void makeSound() {
     System.out.println("Dog barks");
 }
}
