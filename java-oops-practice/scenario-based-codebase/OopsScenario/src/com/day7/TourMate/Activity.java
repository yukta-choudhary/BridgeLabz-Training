package com.day7.TourMate;

//Activity service
public class Activity implements IBookable
{
 private double cost;

 public Activity(double cost)
 {
     this.cost = cost;
 }

 public double getCost()
 {
     return cost;
 }

 public void book()
 {
     System.out.println("Activities booked");
 }

 public void cancel()
 {
     System.out.println("Activities cancelled");
 }
}
