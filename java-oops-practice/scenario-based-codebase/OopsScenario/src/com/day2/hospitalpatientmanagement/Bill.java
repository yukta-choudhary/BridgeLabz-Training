package com.day2.hospitalpatientmanagement;

//Bill
public class Bill implements Payable {
 private double consultationFee;
 private double tax;
 private double discount;

 public Bill(double consultationFee, double tax, double discount) {
     this.consultationFee = consultationFee;
     this.tax = tax;
     this.discount = discount;
 }

 @Override
 public double calculatePayment() {
     double total = consultationFee + tax - discount;  // operators used
     return total;
 }
}
