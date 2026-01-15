package com.day10.birdsanctuary;

import java.util.ArrayList;
import java.util.Scanner;


public class BirdSanctuary {
    static ArrayList<Bird> birds = new ArrayList<>();

    // Reflection example
    public static void showDeveloperInfo(Bird b) {
        Class<?> c = b.getClass().getSuperclass();
        if (c.isAnnotationPresent(DeveloperInfo.class)) {
            DeveloperInfo d = c.getAnnotation(DeveloperInfo.class);
            System.out.println("Developed by: " + d.name() + ", Version: " + d.version());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Display Fly & Swim Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.println("1.Eagle 2.Duck 3.Penguin 4.Kiwi");
                int type = sc.nextInt();

                Bird b = null;
                if (type == 1) b = new Eagle(id, name);
                else if (type == 2) b = new Duck(id, name);
                else if (type == 3) b = new Penguin(id, name);
                else if (type == 4) b = new Kiwi(id, name);

                birds.add(b);
                System.out.println("Bird added.");

            } else if (choice == 2) {
                for (Bird b : birds) {
                    b.display();
                    b.eat();
                    if (b instanceof Flyable) ((Flyable) b).fly();
                    if (b instanceof Swimmable) ((Swimmable) b).swim();
                    showDeveloperInfo(b);
                }

            } else if (choice == 3) {
                for (Bird b : birds)
                    if (b instanceof Flyable) b.display();

            } else if (choice == 4) {
                for (Bird b : birds)
                    if (b instanceof Swimmable) b.display();

            } else if (choice == 5) {
                for (Bird b : birds)
                    if (b instanceof Flyable && b instanceof Swimmable)
                        b.display();

            } else if (choice == 6) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                birds.removeIf(b -> b.getId() == id);
                System.out.println("Bird removed.");

            } else if (choice == 7) {
                int fly = 0, swim = 0, both = 0, neither = 0;
                for (Bird b : birds) {
                    boolean f = b instanceof Flyable;
                    boolean s = b instanceof Swimmable;
                    if (f && s) both++;
                    else if (f) fly++;
                    else if (s) swim++;
                    else neither++;
                }
                System.out.println("Flyable: " + fly);
                System.out.println("Swimmable: " + swim);
                System.out.println("Both: " + both);
                System.out.println("Neither: " + neither);

            } else if (choice == 8) {
                break;
            }
        }
        sc.close();
    }
}

