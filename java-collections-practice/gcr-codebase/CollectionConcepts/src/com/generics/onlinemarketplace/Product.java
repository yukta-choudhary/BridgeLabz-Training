package com.generics.onlinemarketplace;

//Generic Product class
//T must be a Category

class Product<T extends Category> {

 String name;
 double price;
 T category;

 // Constructor
 Product(String name, double price, T category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 // Display product
 void showProduct() {
     System.out.println("Product: " + name);
     System.out.println("Category: " + category.getCategoryName());
     System.out.println("Price: " + price);
 }
}
