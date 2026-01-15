package com.day9.gamebox;

//Arcade game class
public class ArcadeGame extends Game {

 // Constructor
 public ArcadeGame(String title, double price, double rating) {
     super(title, "Arcade", price, rating);
 }

 // Polymorphism
 public void playDemo() {
     System.out.println("Arcade demo: Fast and fun gameplay");
 }
}

