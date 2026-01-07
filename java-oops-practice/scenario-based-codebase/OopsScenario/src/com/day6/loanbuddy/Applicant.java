package com.day6.loanbuddy;

//Applicant class to store user details
public class Applicant {

 private String name;
 private int creditScore;     // private for security
 private double income;
 private double loanAmount;

 // Constructor
 public Applicant(String name, int creditScore, double income, double loanAmount) {
     this.name = name;
     this.creditScore = creditScore;
     this.income = income;
     this.loanAmount = loanAmount;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getCreditScore() {
     return creditScore;
 }

 public double getIncome() {
     return income;
 }

 public double getLoanAmount() {
     return loanAmount;
 }
}
