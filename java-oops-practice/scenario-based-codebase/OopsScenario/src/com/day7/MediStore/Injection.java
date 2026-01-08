package com.day7.MediStore;

//Injection class
public class Injection extends Medicine
{
 public Injection(String name, double price, String expiryDate)
 {
     super(name, price, expiryDate);
 }

 public void checkExpiry()
 {
     System.out.println("Injection: Needs cold storage");
 }
}
