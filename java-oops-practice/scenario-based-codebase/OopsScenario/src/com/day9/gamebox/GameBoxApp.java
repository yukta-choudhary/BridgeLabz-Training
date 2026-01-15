package com.day9.gamebox;

//Main class
import java.util.Scanner;

public class GameBoxApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // User input
     System.out.print("Enter user name: ");
     String name = sc.nextLine();

     User user = new User(name);

     // Create games
     Game g1 = new ArcadeGame("Speed Run", 500, 4.5);
     Game g2 = new StrategyGame("War Plan", 800, 4.2);

     // Apply seasonal offer
     g1.applyOffer(100); // operator usage

     // Polymorphism
     g1.playDemo();
     g2.playDemo();

     // Download and buy
     g1.download();
     user.buyGame(g1);

     sc.close();
 }
}
