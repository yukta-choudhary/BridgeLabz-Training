package com.objectmodelling.hospital;

public class Doctor {

    // Doctor name
    private String name;

    // Constructor
    public Doctor(String name) {
        this.name = name;
    }

    // Communication method
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
    }

    // Getter
    public String getName() {
        return name;
    }
}

