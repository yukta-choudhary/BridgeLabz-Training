package com.functionalinterfaces.unitconversiontool;

public class UnitConversionMain {

	public static void main(String[] args) {
		
		double km = 10000;
		double kg = 80;
		
		System.out.println("Distance in miles: " + ConversionUtil.kmToMiles(km));
		System.out.println("Weigt in ibs: " + ConversionUtil.kgToIbs(kg));
	}
}
