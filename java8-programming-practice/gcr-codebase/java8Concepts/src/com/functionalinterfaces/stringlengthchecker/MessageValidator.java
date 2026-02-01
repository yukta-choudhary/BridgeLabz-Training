package com.functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

public class MessageValidator {

	public void validate(String message, int limit, Function<String, Integer> lenFun) {
		
		int length = lenFun.apply(message);
		
		if(length > limit) {
			System.out.println("Message exceeded limit! " + length);
		} else {
			System.out.println("Message is under limit! " + length);
		}
	}
}
