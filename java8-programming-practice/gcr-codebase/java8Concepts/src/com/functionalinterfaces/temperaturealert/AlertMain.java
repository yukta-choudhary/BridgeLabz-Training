package com.functionalinterfaces.temperaturealert;

public class AlertMain {

	public static void main(String[] args) {
		
		double threshold = 40.7;
		double currentTemp = 56.8;
		
		TempCondition condition = new TempCondition(threshold);
		TempAlert alert = new TempAlert();
		
		alert.checkTemp(currentTemp, condition.isThresholdCrossed());
	}
}
