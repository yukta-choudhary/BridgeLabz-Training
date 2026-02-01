package com.functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

public class LengthCheck {

	public Function<String, Integer> getlength() {
		return message -> message.length();
	}
}
