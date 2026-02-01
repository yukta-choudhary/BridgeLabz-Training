package com.functionalinterfaces.datatagging;

public class CustomerDetails implements SensitiveData {

    private String name;
    private String aadhaarNumber;

    public CustomerDetails(String name, String aadhaarNumber) {
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Aadhaar: " + aadhaarNumber;
    }
}
