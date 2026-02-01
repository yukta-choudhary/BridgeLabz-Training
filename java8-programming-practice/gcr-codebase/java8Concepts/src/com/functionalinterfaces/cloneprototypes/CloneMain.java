package com.functionalinterfaces.cloneprototypes;

public class CloneMain {

    public static void main(String[] args) {

        try {
            PrototypeModel original = new PrototypeModel("InsurancePlan", 1);

            PrototypeModel copy = (PrototypeModel) original.clone();

            System.out.println("Original -> " + original);
            System.out.println("Cloned   -> " + copy);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
