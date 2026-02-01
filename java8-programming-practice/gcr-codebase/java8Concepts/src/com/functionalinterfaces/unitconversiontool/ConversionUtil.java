package com.functionalinterfaces.unitconversiontool;

public interface ConversionUtil {

	public static double kmToMiles(double km) {
		
		return km * 0.621371;
	}
	
	public static double milesToKm(double mile) {
		return mile / 0.621371;
	}
	
	public static double kgToIbs(double kg) {
		return kg * 2.20462;
	}
	
	public static double ibsToKg(double ibs) {
		return ibs / 2.20462;
	}
}
