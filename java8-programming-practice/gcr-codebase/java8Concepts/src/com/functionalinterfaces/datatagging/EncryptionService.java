package com.functionalinterfaces.datatagging;

public class EncryptionService {

    public void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj);
        } else {
            System.out.println("No encryption needed.");
        }
    }
}
