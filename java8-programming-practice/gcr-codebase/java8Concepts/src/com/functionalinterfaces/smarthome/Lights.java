package com.functionalinterfaces.smarthome;

public class Lights implements IControllable{

	@Override
	public void turnOn() {
		System.out.println("Lights are turned on!");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Lights are turned off!");
	}
}
