package com.day9.gamebox;

//Base Game class
public class Game implements IDownloadable {

 protected String title;
 protected String genre;
 protected double price;
 protected double rating;

 // Constructor
 public Game(String title, String genre, double price, double rating) {
     this.title = title;
     this.genre = genre;
     this.price = price;
     this.rating = rating;
 }

 // Download game
 public void download() {
     System.out.println(title + " downloaded");
 }

 // Demo (will be overridden)
 public void playDemo() {
     System.out.println("Playing demo");
 }

 // Apply offer using operator
 public void applyOffer(double discount) {
     price = price - discount;
 }
}
