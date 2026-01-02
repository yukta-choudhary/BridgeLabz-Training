package com.encapsulation.hospitalmanagementsystem;

//Main class to demonstrate polymorphism
public class HospitalMain {

 public static void main(String[] args) {

     // Polymorphism using Patient reference
     Patient p1 = new InPatient(1, "Rohan", 45, 5, 2000);
     Patient p2 = new OutPatient(2, "Anita", 30, 500);

     Patient[] patients = { p1, p2 };

     for (Patient p : patients) {

         p.getPatientDetails();
         System.out.println("Bill Amount: " + p.calculateBill());

         // Medical record access
         if (p instanceof MedicalRecord) {
             MedicalRecord m = (MedicalRecord) p;
             m.addRecord("Routine check-up");
             m.viewRecords();
         }

         System.out.println("----------------------");
     }
 }
}
