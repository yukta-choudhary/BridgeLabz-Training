package com.functionalinterfaces.dataexport;

public class ExportMain {

    public static void main(String[] args) {

        ReportExporter sales = new SalesReportExporter();
        ReportExporter finance = new FinanceReportExporter();

        sales.exportToCSV();
        sales.exportToJSON();

        finance.exportToPDF();
        finance.exportToJSON();
    }
}
