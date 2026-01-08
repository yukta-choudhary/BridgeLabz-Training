package com.day7.TourMate;
//Hotel service
public class Hotel implements IBookable
{
 private double cost;

 public Hotel(double cost)
 {
     this.cost = cost;
 }

 public double getCost()
 {
     return cost;
 }

 public void book()
 {
     System.out.println("Hotel booked");
 }

 public void cancel()
 {
     System.out.println("Hotel cancelled");
 }
}
