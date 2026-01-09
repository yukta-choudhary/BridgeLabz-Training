package com.day8.Artify;

//Child class
public class DigitalArt extends Artwork
{
 public DigitalArt(String title, String artist, double price)
 {
     super(title, artist, price);
     licenseType = "Digital License";
 }

 // Polymorphism
 public void license()
 {
     System.out.println("Digital Art License: Personal use only");
 }
}

