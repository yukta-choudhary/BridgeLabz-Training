package com.objectmodelling.company;
import java.util.ArrayList;

//Company class
public class Company {

	 // Company name
	 private String companyName;
	
	 // Composition: Company has Departments
	 private ArrayList<Department> departments;
	
	 // Constructor
	 public Company(String companyName) {
	     this.companyName = companyName;
	     departments = new ArrayList<>();
	 }
	
	 // Add department
	 public void addDepartment(Department dept) {
	     departments.add(dept);
	 }
	
	 // Show company details
	 public void showCompany() {
	     System.out.println("Company: " + companyName);
	     for (Department d : departments) {
	         d.showEmployees();
	     }
	 }
	
	 // Delete company (composition behavior)
	 public void deleteCompany() {
	     for (Department d : departments) {
	         d.removeAllEmployees(); // employees removed
	     }
	     departments.clear(); // departments removed
	     System.out.println("Company deleted");
	 }
}
