package com.constructor;

public class PersonMain {
	  public static void main(String[] args) {

	        // Original object
	        Person p1 = new Person("Yukta", 21);
	        System.out.println("Original Person Details:");
	        p1.display();

	        System.out.println();

	        // Cloned object using copy constructor
	        Person p2 = new Person(p1);
	        System.out.println("Cloned Person Details:");
	        p2.display();
	    }
}
