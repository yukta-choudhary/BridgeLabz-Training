package com.objectmodelling.hospital;

import java.util.ArrayList;

public class Hospital {

    // Hospital name
    private String hospitalName;

    // Doctors in hospital
    private ArrayList<Doctor> doctors;

    // Patients in hospital
    private ArrayList<Patient> patients;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    // Add doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Show hospital info
    public void showHospital() {
        System.out.println("Hospital: " + hospitalName);

        System.out.println("\nDoctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }

        System.out.println("\nPatients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
