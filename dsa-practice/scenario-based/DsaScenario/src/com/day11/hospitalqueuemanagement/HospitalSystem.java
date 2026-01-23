package com.day11.hospitalqueuemanagement;

import java.util.Scanner;

public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HospitalAVL avl = new HospitalAVL();
        PatientNode root = null;

        int ch;
        do {
            System.out.println("\n1.Register 2.Display Queue 3.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter Arrival Time: ");
                int time = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Patient Name: ");
                String name = sc.nextLine();
                root = avl.insert(root, time, name);
            } else if (ch == 2) {
                System.out.println("Patient Queue:");
                avl.display(root);
            }
        } while (ch != 3);
    }
}

