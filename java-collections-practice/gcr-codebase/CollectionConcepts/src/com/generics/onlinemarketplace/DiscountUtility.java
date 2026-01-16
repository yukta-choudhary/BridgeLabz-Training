package com.generics.onlinemarketplace;

//Utility class for generic methods

class DiscountUtility {

 // Generic method with bounded type
 static <T extends Product<?>> void applyDiscount(T product, double percent) {

     double discount = product.price * percent / 100;
     product.price = product.price - discount;

     System.out.println("Discount applied: " + percent + "%");
 }
}

