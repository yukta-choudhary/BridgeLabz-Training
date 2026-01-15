package com.day9.gamebox;

//Strategy game class
public class StrategyGame extends Game {

 // Constructor
 public StrategyGame(String title, double price, double rating) {
     super(title, "Strategy", price, rating);
 }

 // Polymorphism
 public void playDemo() {
     System.out.println("Strategy demo: Think before you move");
 }
}

