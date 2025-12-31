package com.inheritance.course;

/*
Subclass: PaidOnlineCourse
Extends OnlineCourse
*/

public class PaidOnlineCourse extends OnlineCourse {

    double fee;
    double discount;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Course Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }
}
