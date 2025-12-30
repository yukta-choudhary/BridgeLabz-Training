package com.objectmodelling.university;

public class Faculty {

    // Faculty name
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Display faculty info
    public void showFaculty() {
        System.out.println("Faculty Name: " + name);
    }

    // Getter
    public String getName() {
        return name;
    }
}
