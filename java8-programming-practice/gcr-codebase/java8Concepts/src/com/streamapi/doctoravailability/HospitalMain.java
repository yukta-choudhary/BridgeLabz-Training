package com.streamapi.doctoravailability;

import java.util.*;

public class HospitalMain {

    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
            new Doctor("Dr. Doe", "Dermatologist", true),
            new Doctor("Dr. Trump", "Orthopedic", false),
            new Doctor("Dr. Sharma", "Cardiologist", true),
            new Doctor("Dr. Iris", "Neurologist", true),
            new Doctor("Dr. Rollz", "Pediatrician", false)
        );

        List<Doctor> weekendDoctors = doctors.stream()
                .filter(Doctor::isAvailableOnWeekend)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .toList();

        weekendDoctors.forEach(System.out::println);
    }
}