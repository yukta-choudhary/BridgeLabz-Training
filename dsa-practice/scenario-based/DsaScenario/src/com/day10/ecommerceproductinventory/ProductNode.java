package com.day10.ecommerceproductinventory;

//Node class for product
class ProductNode {
 int sku;
 String name;
 double price;
 ProductNode left, right;

 // Constructor
 ProductNode(int sku, String name, double price) {
     this.sku = sku;
     this.name = name;
     this.price = price;
     left = right = null;
 }
}

