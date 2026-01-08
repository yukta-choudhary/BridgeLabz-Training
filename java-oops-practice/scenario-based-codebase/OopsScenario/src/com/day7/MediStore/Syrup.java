package com.day7.MediStore;

//Syrup class
public class Syrup extends Medicine
{
 public Syrup(String name, double price, String expiryDate)
 {
     super(name, price, expiryDate);
 }

 public void checkExpiry()
 {
     System.out.println("Syrup: Use quickly after opening");
 }
}
