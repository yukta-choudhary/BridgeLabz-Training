package com.day8.Artify;

//Child class
public class PrintArt extends Artwork
{
 public PrintArt(String title, String artist, double price)
 {
     super(title, artist, price);
     licenseType = "Print License";
 }

 // Polymorphism
 public void license()
 {
     System.out.println("Print Art License: One-time print use");
 }
}
