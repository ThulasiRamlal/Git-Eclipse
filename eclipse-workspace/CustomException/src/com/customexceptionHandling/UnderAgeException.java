package com.customexceptionHandling;

public class UnderAgeException extends Exception {

	@Override
	public String getMessage() {
		return "Yout are too young to get married";
	}

	
}
