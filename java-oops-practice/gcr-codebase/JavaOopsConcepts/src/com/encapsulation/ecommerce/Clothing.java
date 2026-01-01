package com.encapsulation.ecommerce;

//Clothing product
public class Clothing extends Product implements Taxable {

 public Clothing(int id, String name, double price) {
     super(id, name, price);
 }

 // 20% discount
 @Override
 public double calculateDiscount() {
     return getPrice() * 0.20;
 }

 // 5% tax
 @Override
 public double calculateTax() {
     return getPrice() * 0.05;
 }

 @Override
 public String getTaxDetails() {
     return "GST 5%";
 }
}
