package com.functionalinterfaces.dataexport;

public class SalesReportExporter implements ReportExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Sales Report exported as CSV.");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Sales Report exported as PDF.");
    }
}
