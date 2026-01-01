package com.encapsulation.ecommerce;

//Main class to demonstrate polymorphism
public class EcommerceMain {
	
	 // Polymorphic method
	 public static void printFinalPrice(Product product) {
	
	     double price = product.getPrice();
	     double discount = product.calculateDiscount();
	     double tax = 0;
	
	     // Check if product is taxable
	     if (product instanceof Taxable) {
	         tax = ((Taxable) product).calculateTax();
	     }
	
	     double finalPrice = price + tax - discount;
	
	     System.out.println("Product: " + product.getName());
	     System.out.println("Final Price: " + finalPrice);
	     System.out.println("-----------------------");
	 }
	
	 public static void main(String[] args) {
	
	     // Product objects
	     Product p1 = new Electronics(1, "Laptop", 60000);
	     Product p2 = new Clothing(2, "Jacket", 3000);
	     Product p3 = new Groceries(3, "Rice", 1000);
	
	     // Polymorphism
	     Product[] products = { p1, p2, p3 };
	
	     for (Product p : products) {
	         printFinalPrice(p);
	     }
	 }
}

