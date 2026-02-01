package com.functionalinterfaces.rentalsystem;

public class Cars implements IRental {

	@Override
	public void rent() {
		System.out.println("Car rented for 1000 INR");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Car returned after 12hrs!");
	}
}
