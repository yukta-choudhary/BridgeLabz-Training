package com.day4.petpal;

//Main class
import java.util.Scanner;

public class PetPalApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Pet input
     System.out.print("Enter pet type (dog/cat/bird): ");
     String type = sc.nextLine();

     System.out.print("Enter pet name: ");
     String name = sc.nextLine();

     System.out.print("Enter pet age: ");
     int age = sc.nextInt();

     Pet p;

     if (type.equals("dog")) {
         p = new Dog(name, age);
     } else if (type.equals("cat")) {
         p = new Cat(name, age);
     } else {
         p = new Bird(name, age);
     }

     // Interactions
     p.makeSound();
     ((IInteractable)p).feed();
     ((IInteractable)p).play();
     ((IInteractable)p).sleep();

     // Status
     p.showStatus();

     sc.close();
 }
}
