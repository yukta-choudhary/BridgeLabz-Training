package com.functionalinterfaces.dataexport;

public interface ReportExporter {

    void exportToCSV();

    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting report to JSON using default implementation...");
    }
}
