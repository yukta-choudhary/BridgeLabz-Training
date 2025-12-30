package com.objectmodelling.ecommerce;

public class EcommerceMain {

    public static void main(String[] args) {

        // Create customer
        Customer customer = new Customer("Yukta");

        // Create products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1200);

        // Create order
        Order order = new Order(101);

        // Add products to order
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        // Customer places order
        customer.placeOrder(order);
    }
}
