package com.day10.payxpress;

import java.util.Scanner;

public class PayXpress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Bill Type:");
        System.out.println("1. Electricity");
        System.out.println("2. Water");
        System.out.println("3. Internet");
        int choice = sc.nextInt();

        System.out.print("Enter bill amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter due date: ");
        String dueDate = sc.nextLine();

        IPayable bill = null;

        if (choice == 1) {
            bill = new ElectricityBill(amount, dueDate);
        } else if (choice == 2) {
            bill = new WaterBill(amount, dueDate);
        } else if (choice == 3) {
            bill = new InternetBill(amount, dueDate);
        } else {
            System.out.println("Invalid choice!");
            return;
        }
        sc.close();
        bill.sendReminder();

        System.out.print("Do you want to pay now? (yes/no): ");
        String payChoice = sc.nextLine();

        if (payChoice.equalsIgnoreCase("yes")) {
            bill.pay();
        }


    }
}
