package com.functionalinterfaces.strengthvalidator;

public class ValidatorMain {

	public static void main(String[] args) {
		
		String password = "Aryaman@";
		
		if(SecurityUtils.isStrong(password)) {
			System.out.println(password + " is a strong!");
		} else {
			System.out.println(password + " is weak!");
		}
	}
}
