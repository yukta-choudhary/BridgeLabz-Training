package com.day7.MediStore;

//Tablet class
public class Tablet extends Medicine
{
 public Tablet(String name, double price, String expiryDate)
 {
     super(name, price, expiryDate);
 }

 public void checkExpiry()
 {
     System.out.println("Tablet: Long shelf life");
 }
}

