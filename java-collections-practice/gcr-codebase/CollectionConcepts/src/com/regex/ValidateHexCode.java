package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexCode {
	public static void main(String[] args) {
		
		//Scanner class object 
		Scanner sc = new Scanner(System.in);
		
		//Take input
		System.out.println("Enter a hexcode(Must start with #, followed by 6 hexadecimal characters)");
		String hexcode = sc.nextLine();
		
		//Create a regex
		String regex = "^[#][a-fA-F0-9]{6}$";
		
		//Regex compilation
		Pattern pattern = Pattern.compile(regex);
		
		//Linking Regex with hexcode
		Matcher matcher = pattern.matcher(hexcode);
		
		if(matcher.matches()) {
			System.out.println("Valid Input");
		}else {
			System.out.println("Invalid Input");
		}
		
		//Close Scanner class object
		sc.close();
		
	}
}
