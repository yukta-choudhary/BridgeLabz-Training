package com.day9.gamebox;

//User class
public class User {

 private String name;
 private Game[] ownedGames;   // encapsulated
 private int count;

 // Constructor
 public User(String name) {
     this.name = name;
     ownedGames = new Game[5];
     count = 0;
 }

 // Add game to user library
 public void buyGame(Game g) {
     ownedGames[count] = g;
     count++;
     System.out.println(g.title + " added to library");
 }
}

