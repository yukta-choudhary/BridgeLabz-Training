package com.generics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

// Question: Smart Warehouse Management System using Generics

public class SmartWarehouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lists for items
        ArrayList<Electronics> eList = new ArrayList<>();
        ArrayList<Groceries> gList = new ArrayList<>();
        ArrayList<Furniture> fList = new ArrayList<>();

        System.out.print("Enter Electronics item name: ");
        String eName = sc.nextLine();
        eList.add(new Electronics(eName));

        System.out.print("Enter Grocery item name: ");
        String gName = sc.nextLine();
        gList.add(new Groceries(gName));

        System.out.print("Enter Furniture item name: ");
        String fName = sc.nextLine();
        fList.add(new Furniture(fName));

        System.out.println("\n--- Warehouse Items ---");

        // Display using wildcard method
        WarehouseUtility.displayItems(eList);
        WarehouseUtility.displayItems(gList);
        WarehouseUtility.displayItems(fList);

        sc.close();
    }
}

