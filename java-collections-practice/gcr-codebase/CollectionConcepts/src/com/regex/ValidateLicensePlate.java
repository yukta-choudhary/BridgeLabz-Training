package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Create Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Take input
		System.out.println("Enter a license plate number(Can start with 2 capital letters and followed by four digits):");
		String licensePlateNumber = sc.nextLine();
		
		//Create regex expression
		String regex = "^[A-Z]{2}[0-9]{4}$";
		
		//Compile regex
		Pattern pattern = Pattern.compile(regex);
		
		//Link regex with input 
		Matcher matcher = pattern.matcher(licensePlateNumber);
		
		if(matcher.matches()) {
			System.out.println("Valid License Plate number");
		}else {
			System.out.println("Invalid License Plate number");
		}
		
		//Close scanner object
		sc.close();
	}

}
