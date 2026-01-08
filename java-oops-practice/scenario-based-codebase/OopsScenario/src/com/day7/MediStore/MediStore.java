package com.day7.MediStore;

/*
Main class – MediStore
*/

import java.util.Scanner;

public class MediStore
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter medicine type (tablet/syrup/injection):");
        String type = sc.next();

        System.out.println("Enter medicine name:");
        String name = sc.next();

        System.out.println("Enter price:");
        double price = sc.nextDouble();

        System.out.println("Enter expiry date:");
        String date = sc.next();

        System.out.println("Enter quantity to sell:");
        int qty = sc.nextInt();

        Medicine m;

        // Polymorphism
        if (type.equalsIgnoreCase("tablet"))
            m = new Tablet(name, price, date);
        else if (type.equalsIgnoreCase("syrup"))
            m = new Syrup(name, price, date);
        else
            m = new Injection(name, price, date);

        m.checkExpiry();
        m.sell(qty);

        sc.close();
    }
}
