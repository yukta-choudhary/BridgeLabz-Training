package com.day2.employeeoptional;

import java.util.Optional;

public class EmployeeOptionalDemo {

    public static void main(String[] args) {

        Employee emp = new Employee("Amit", null, null, null, null);

        // 1. Manager details
        Optional<String> manager =
                Optional.ofNullable(emp.getManager());
        System.out.println("Manager: " +
                manager.orElse("No Manager Assigned"));

        // 2. Bonus amount
        Optional<Double> bonus =
                Optional.ofNullable(emp.getBonus());
        System.out.println("Bonus: " + bonus.orElse(0.0));

        // 3. Find employee by email
        Optional<String> email =
                Optional.ofNullable(emp.getEmail());
        String empEmail = email.orElseThrow(
                () -> new RuntimeException("Employee not found"));
        System.out.println("Email: " + empEmail);

        // 4. Insurance details
        Optional<String> insurance =
                Optional.ofNullable(emp.getInsurance());
        System.out.println("Insurance: " +
                insurance.orElse("No Insurance"));

        // 5. Middle name
        Optional<String> middle =
                Optional.ofNullable(emp.getMiddleName());
        middle.ifPresent(m ->
                System.out.println("Middle Name: " + m));
    }
}

class Employee {
    private String name;
    private String middleName;
    private String manager;
    private Double bonus;
    private String insurance;
    private String email;

    public Employee(String name, String middleName,
                    String manager, Double bonus, String insurance) {
        this.name = name;
        this.middleName = middleName;
        this.manager = manager;
        this.bonus = bonus;
        this.insurance = insurance;
        this.email = "amit@company.com";
    }

    public String getMiddleName() { return middleName; }
    public String getManager() { return manager; }
    public Double getBonus() { return bonus; }
    public String getInsurance() { return insurance; }
    public String getEmail() { return email; }
}
