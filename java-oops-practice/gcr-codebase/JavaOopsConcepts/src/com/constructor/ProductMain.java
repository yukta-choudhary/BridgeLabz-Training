package com.constructor;

public class ProductMain {

    public static void main(String[] args) {

        // Create product objects
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);
        Product p3 = new Product("Headphones", 2000);

        // Display product details
        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        System.out.println();

        // Display total products
        Product.displayTotalProducts();
    }
}
