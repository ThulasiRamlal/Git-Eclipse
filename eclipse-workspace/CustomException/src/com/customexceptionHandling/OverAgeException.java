package com.customexceptionHandling;

public class OverAgeException extends Exception {

	@Override
	public String getMessage() {
	return"You are too Old to get married"; 
	}
	

}
