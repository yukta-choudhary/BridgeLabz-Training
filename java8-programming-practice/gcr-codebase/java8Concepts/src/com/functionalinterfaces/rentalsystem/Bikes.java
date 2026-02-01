package com.functionalinterfaces.rentalsystem;

public class Bikes implements IRental {

	@Override
	public void rent() {
		System.out.println("Bike rented for 500 INR");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Bike returned after 18hrs");
	}
}
