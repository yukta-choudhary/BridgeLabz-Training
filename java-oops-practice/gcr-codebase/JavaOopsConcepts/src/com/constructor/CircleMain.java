package com.constructor;

public class CircleMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object using default constructor
        Circle c1 = new Circle();
        System.out.println("Default Constructor Output:");
        c1.display();

        System.out.println();

        // User input
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        // Object using parameterized constructor
        Circle c2 = new Circle(r);
        System.out.println("Parameterized Constructor Output:");
        c2.display();

        sc.close();
    }
}
