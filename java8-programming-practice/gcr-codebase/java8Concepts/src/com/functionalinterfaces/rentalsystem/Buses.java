package com.functionalinterfaces.rentalsystem;


public class Buses implements IRental {

	@Override
	public void rent() {
		System.out.println("Bus rented for 5000 INR");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Bus returned after 24hrs");
	}
}
