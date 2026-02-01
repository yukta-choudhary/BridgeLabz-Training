package com.functionalinterfaces.temperaturealert;

import java.util.function.Predicate;

public class TempAlert {

	public void checkTemp(double currentTemp, Predicate<Double> condition) {
		
		if(condition.test(currentTemp)) {
			System.out.println("Alert!!! Temperature corssed threshold");
		} else {
			System.out.println("Temperatire is normal " + currentTemp);
		}
	}
}
