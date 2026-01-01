package com.encapsulation.ecommerce;

//Electronics product
public class Electronics extends Product implements Taxable {

 public Electronics(int id, String name, double price) {
     super(id, name, price);
 }

 // 10% discount
 @Override
 public double calculateDiscount() {
     return getPrice() * 0.10;
 }

 // 18% tax
 @Override
 public double calculateTax() {
     return getPrice() * 0.18;
 }

 @Override
 public String getTaxDetails() {
     return "GST 18%";
 }
}

