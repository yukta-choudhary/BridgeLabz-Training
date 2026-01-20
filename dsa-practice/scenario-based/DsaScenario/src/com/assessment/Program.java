package com.assessment;

import java.util.Scanner;

public class Program {
	public static String CleanseAndInvert(String input) {
		
		// Create a keyStr to store generated key
		StringBuilder newStr = new StringBuilder("");
		
		// Convert input string to lowercase
		String lowercaseStr = input.toLowerCase();
		
		//Return empty string if string is null or length of string is less than 6
		if(lowercaseStr == null || lowercaseStr.length()<6) {
			return "";
		}
		
		//Remove all characters whose ASCII values are even numbers.
		for(int i = 0; i < lowercaseStr.length(); i++) {
			if(lowercaseStr.charAt(i) >= 97 &&  lowercaseStr.charAt(i) <= 122) {
				if((int)lowercaseStr.charAt(i)%2 != 0) {
					newStr.append(lowercaseStr.charAt(i));
				}
			}
			else{
				return "";
			}
		}
		
		//Create a StringBuilder object which returns the reference to the string after reversing
		StringBuilder sb = new StringBuilder(newStr);
		String revStr = sb.reverse().toString();
		sb.setLength(0);
		
		//In reversed string convert characters that have even position(0 based index) to uppercase
		for(int i = 0; i < revStr.length(); i++) {
			if(i%2 == 0) {
				sb.append(Character.toUpperCase(revStr.charAt(i)));
			}else {
				sb.append(revStr.charAt(i));
			}
		}
		return sb.toString();
	}
	
	//Main method
	public static void main(String[] args) {
		
		//Create a scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Create a variable to take user input
		System.out.println("Enter the word");
		String input = sc.nextLine();
		
		//Call the method for key generation and check if its a empty string or valid string and display output accordingly
		if(CleanseAndInvert(input).equals("")) {
			System.out.println("Invalid Input");
		}else {
			System.out.println("The generated key is - " + CleanseAndInvert(input));
		}
		
		//Close scanner class object
		sc.close();
	}
}
