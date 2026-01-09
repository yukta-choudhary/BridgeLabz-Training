package com.day8.Artify;

//Parent class
public class Artwork implements IPurchasable
{
 String title;
 String artist;
 double price;
 protected String licenseType;   // protected for child classes

 // Constructor without preview
 public Artwork(String title, String artist, double price)
 {
     this.title = title;
     this.artist = artist;
     this.price = price;
 }

 public void showDetails()
 {
     System.out.println("Title: " + title);
     System.out.println("Artist: " + artist);
     System.out.println("Price: " + price);
 }

 // Default purchase logic
 public void purchase(User user)
 {
     if(user.walletBalance >= price)
     {
         user.walletBalance = user.walletBalance - price;
         System.out.println("Purchase successful");
     }
     else
     {
         System.out.println("Insufficient balance");
     }
 }

 public void license()
 {
     System.out.println("Standard license applied");
 }
}
