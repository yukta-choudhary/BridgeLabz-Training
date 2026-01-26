package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
	public static void main(String[] args) {
		
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		
		//Compile regex expression
		Pattern pattern = Pattern.compile(regex);
		
		//Take input
		System.out.println("Enter a Username(only alphanumeric and _)");		
		String username = sc.nextLine();
		
		//Link regex expression to input
		Matcher matcher = pattern.matcher(username);
		
		//Check if username matches regex rule
		if(matcher.matches()) {
			System.out.println("Valid Username");
		}else {
			System.out.println("Invalid Username");
		}
		
		//close scanner class object
		sc.close();
		
	}
}
