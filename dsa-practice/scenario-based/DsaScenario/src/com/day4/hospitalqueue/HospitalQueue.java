package com.day4.hospitalqueue;

import java.util.Scanner;

public class HospitalQueue {

    // Bubble Sort by criticality (high to low)
    static void bubbleSort(Patient[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent patients
                if (arr[j].criticality < arr[j + 1].criticality) {

                    // Swap patients
                    Patient temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        Patient[] patients = new Patient[n];

        // Input patient data
        for (int i = 0; i < n; i++) {
            System.out.println("\nPatient " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Criticality (1-10): ");
            int crit = sc.nextInt();

            patients[i] = new Patient(id, name, crit);
        }

        // Sort before assigning beds
        bubbleSort(patients, n);

        System.out.println("\nPatients sorted by criticality:");
        for (int i = 0; i < n; i++) {
            patients[i].display();
        }

        sc.close();
    }
}

