package com.functionalinterfaces.strengthvalidator;

public interface SecurityUtils {

	public static boolean isStrong(String password) {
		
		if(password == null || password.length() < 8) {
			return false;
		}
		
		boolean isUpper = false;
		boolean isLower = false;
		boolean isSpecial = false;
		boolean isNumber = false;
		
		for(char ch : password.toCharArray()) {
			if(Character.isUpperCase(ch)) isUpper = true;
			else if(Character.isLowerCase(ch)) isLower = true;
			else if(Character.isDigit(ch)) isNumber = true;
			else isSpecial = true;
		}
		
		return isUpper && isLower && isSpecial && isNumber;
	}
}
