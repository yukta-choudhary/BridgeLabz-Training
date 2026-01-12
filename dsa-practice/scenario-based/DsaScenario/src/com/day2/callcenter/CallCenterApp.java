package com.day2.callcenter;
/*
CallCenter – Customer Queue Manager
Main class
*/

import java.util.Scanner;

class CallCenterApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CallManager manager = new CallManager();

        System.out.print("Enter number of calls: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < n; i++) {

            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Is VIP? (yes/no): ");
            String vipInput = sc.nextLine();

            boolean vip = vipInput.equalsIgnoreCase("yes");

            Customer c = new Customer(name, vip);
            manager.addCall(c);
        }

        System.out.println("\nServing VIP Customers:");
        manager.serveVip();

        System.out.println("\nServing Normal Customers:");
        manager.serveNormal();

        System.out.println("\nCustomer Call Count:");
        manager.showCallCount();

        sc.close();
    }
}


