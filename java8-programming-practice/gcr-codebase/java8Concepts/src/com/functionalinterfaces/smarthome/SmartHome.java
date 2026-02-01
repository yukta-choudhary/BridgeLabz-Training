package com.functionalinterfaces.smarthome;

public class SmartHome {

	public static void main(String[] args) {
		
		IControllable device1 = new Lights();
		IControllable device2 = new AC();
		IControllable device3 = new TV();
		
		device1.turnOn();
		device2.turnOn();
		device3.turnOn();
		
		device1.turnOff();
		device2.turnOff();
		device3.turnOff();
	}
}
