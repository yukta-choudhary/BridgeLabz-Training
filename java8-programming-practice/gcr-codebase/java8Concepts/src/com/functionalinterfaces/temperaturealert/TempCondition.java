package com.functionalinterfaces.temperaturealert;

import java.util.function.Predicate;

public class TempCondition {

	private double threshold;
	
	public TempCondition(double threshold) {
		this.threshold = threshold;
	}
	
	public Predicate<Double> isThresholdCrossed() {
		return temp -> temp > threshold;
	}
}
