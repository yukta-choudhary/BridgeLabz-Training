package com.day2.trafficmanager;
/*
TrafficManager – Roundabout Vehicle Flow
Main class
*/

import java.util.Scanner;

class TrafficApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Roundabout round = new Roundabout();
        CarQueue queue = new CarQueue();
        int choice;

        do {
            System.out.println("\n1.Add car to queue");
            System.out.println("2.Enter roundabout");
            System.out.println("3.Exit roundabout");
            System.out.println("4.Display roundabout");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter car name: ");
                    queue.enqueue(sc.nextLine());
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        String car = queue.dequeue();
                        round.addCar(car);
                        System.out.println(car + " entered roundabout");
                    }
                    break;

                case 3:
                    System.out.print("Enter car to remove: ");
                    round.removeCar(sc.nextLine());
                    break;

                case 4:
                    round.display();
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}

