package com.objectmodelling.hospital;

public class HospitalMain {

    public static void main(String[] args) {

        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor d1 = new Doctor("Dr. Sharma");
        Doctor d2 = new Doctor("Dr. Verma");

        // Create patients
        Patient p1 = new Patient("Rohan");
        Patient p2 = new Patient("Amit");

        // Add doctors and patients to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Show hospital details
        hospital.showHospital();

        // Consultations (communication)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
