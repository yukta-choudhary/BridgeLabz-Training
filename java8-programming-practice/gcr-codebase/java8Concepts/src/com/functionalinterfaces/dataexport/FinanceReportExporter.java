package com.functionalinterfaces.dataexport;

public class FinanceReportExporter implements ReportExporter {

	@Override
	public void exportToCSV() {
		System.out.println("Finance Report exported as CSV.");
	}

	@Override
	public void exportToPDF() {
		System.out.println("Finance Report exported as PDF.");
	}

	@Override
	public void exportToJSON() {
		System.out.println("Finance Report exported as JSON with financial formatting.");
	}
}
