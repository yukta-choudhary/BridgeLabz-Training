package com.objectmodelling.company;
//Main class
public class CompanyMain {

	 public static void main(String[] args) {
	
	     // Create company
	     Company company = new Company("TechSoft");
	
	     // Create departments
	     Department devDept = new Department("Development");
	     Department hrDept = new Department("HR");
	
	     // Add employees to departments
	     devDept.addEmployee("Rohan");
	     devDept.addEmployee("Amit");
	
	     hrDept.addEmployee("Neha");
	
	     // Add departments to company
	     company.addDepartment(devDept);
	     company.addDepartment(hrDept);
	
	     // Show company structure
	     company.showCompany();
	
	     System.out.println();
	
	     // Delete company
	     company.deleteCompany();
	 }
}
