package com.functionalinterfaces.dateformat;


import java.time.LocalDate;

public class InvoiceMain {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String format1 = DateFormatterUtil.formatDate(today, "dd-MM-yyyy");
        String format2 = DateFormatterUtil.formatDate(today, "MMMM dd, yyyy");
        String format3 = DateFormatterUtil.formatDate(today, "yyyy/MM/dd");

        System.out.println("Invoice Date: " + format1);
        System.out.println("Customer View Date: " + format2);
        System.out.println("Database Date: " + format3);
    }
}
