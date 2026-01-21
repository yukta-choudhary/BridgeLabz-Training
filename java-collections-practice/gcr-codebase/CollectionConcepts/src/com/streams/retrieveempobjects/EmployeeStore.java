package com.streams.retrieveempobjects;
import java.io.*;
import java.util.*;

public class EmployeeStore {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Amit", "IT", 50000));
        list.add(new Employee(2, "Neha", "HR", 40000));

        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("emp.dat"));
            oos.writeObject(list);
            oos.close();

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("emp.dat"));

            ArrayList<Employee> empList =
                    (ArrayList<Employee>) ois.readObject();

            for (Employee e : empList) {
                System.out.println(e.id + " " + e.name + " " + e.dept + " " + e.salary);
            }

            ois.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

