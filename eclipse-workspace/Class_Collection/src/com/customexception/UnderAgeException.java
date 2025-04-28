package com.customexception;

public class UnderAgeException extends Exception {
	//@Overide
	public String getMessage()
	{
		return"You are not eligible for married because UnderAge";
	}

}
