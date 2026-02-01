package com.functionalinterfaces.smarthome;

public class AC implements IControllable{

	@Override
	public void turnOn() {
		System.out.println("AC is turned on!");
	}
	
	@Override
	public void turnOff() {
		System.out.println("AC is turned off!");
	}
}
