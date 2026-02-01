package com.functionalinterfaces.stringlengthchecker;

public class StrLengthMain {

	public static void main(String[] args) {
		
		String message = "Hello, my name is java";
		int limit = 30;
		
		LengthCheck lc = new LengthCheck();
		MessageValidator validator = new MessageValidator();
		
		validator.validate(message, limit, lc.getlength());
	}
}
